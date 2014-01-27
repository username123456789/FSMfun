/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package finitestatemachines;

/**
 *
 * @author User
 */
public class StateMachine {
    
    private Student owner;
    private State currentState;
    private State previousState;
    private State globalState;
    
    public void Update()
    {
        if(globalState != null)
        {
            globalState.Execute(owner);
        }
        
        if(currentState != null)
        {
            currentState.Execute(owner);
        }
    }
    
    public void ChangeState(State newState)
    {
        if(newState == null)
        {
            System.err.println("Proslijedjen je state koji je null!");
            System.exit(1);
        }
        
        previousState = currentState;
        currentState.Exit(owner);
        currentState = newState;
        currentState.Execute(owner);
    }
    
    public void RevertToPreviousState()
    {
        ChangeState(previousState);
    }
    
}
