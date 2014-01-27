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
public class DrinkingState implements State {

    @Override
    public void Enter(Student entity) {
        if(entity.getLocation() != Location.KITCHEN)
        {
            entity.setLocation(Location.KITCHEN);
            System.out.println("Student je ozednio i ide u kuhinju da se napije vode.");
        }
    }

    @Override
    public void Execute(Student entity) {
        entity.setThirst(0);
        System.out.println("Gulp gulp! Ahhh ova voda je dobro dosla!");
    }

    @Override
    public void Exit(Student entity) {
        System.out.println("Student se napio vode i izlazi iz kuhinje!");
    }
    
}
