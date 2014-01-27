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
    
    public StateMachine(Student owner, State currentState, State previousState, State globalState) {
        this.owner = owner;
        this.currentState = currentState;
        this.previousState = previousState;
        this.globalState = globalState;
    }
    
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
        currentState.Enter(owner);
        currentState.Execute(owner);
    }
    
    public void RevertToPreviousState()
    {
        ChangeState(previousState);
    }

    public Student getOwner() {
        return owner;
    }

    public State getCurrentState() {
        return currentState;
    }

    public State getPreviousState() {
        return previousState;
    }

    public State getGlobalState() {
        return globalState;
    }

}
