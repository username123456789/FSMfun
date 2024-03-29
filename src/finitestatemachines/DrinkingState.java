/*
 * 
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
        if(entity.getThirst() <= 0)
        {
            entity.getStateMachine().ChangeState(new LearningState());
        }
    }

    @Override
    public void Exit(Student entity) {
        System.out.println("Student se napio vode!");
        System.out.println("\n");
    }
    
}
