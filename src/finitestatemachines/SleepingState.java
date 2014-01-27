/*
 * 
 */

package finitestatemachines;

/**
 *
 * @author User
 */
public class SleepingState implements State {

    @Override
    public void Enter(Student entity) {
        if(entity.getLocation() != Location.BEDROOM)
        {
            entity.setLocation(Location.BEDROOM);
            System.out.println("Student ide u spavacu sobu da odspava, jer je to i zasluzio!");
        }
    }

    @Override
    public void Execute(Student entity) {
        entity.setFatigue(entity.getFatigue()-4);
        System.out.println("ZZZZZ... ZZZZZ...!");
        if(entity.getFatigue()<=0)
        {
            entity.setFatigue(0);
            entity.getStateMachine().ChangeState(new LearningState());
        }
    }

    @Override
    public void Exit(Student entity) {
        System.out.println("Student se budi odmoran i spreman za nove pobjede!");
        System.out.println("\n");
    }
    
}
