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
public class LearningState implements State {

    @Override
    public void Enter(Student entity) {
        System.out.println("Student ide u dnevni boravak da uci!");
    }

    @Override
    public void Execute(Student entity) {
        System.out.println("");
    }

    @Override
    public void Exit(Student entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
