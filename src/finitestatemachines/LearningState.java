/*
 */

package finitestatemachines;

/**
 *
 * @author User
 */
public class LearningState implements State {

    @Override
    public void Enter(Student entity) {
        if(entity.getLocation() != Location.PERSONAL_ROOM)
        {
            System.out.println("Student ide u svoju sobu da uci!");
            entity.setLocation(Location.PERSONAL_ROOM);
        }
    }

    @Override
    public void Execute(Student entity) {
        entity.setAlreadyLearned(entity.getAlreadyLearned()+2);
        entity.setThirst(entity.getThirst()+1);
        entity.setHunger(entity.getHunger()+1);
        entity.setFatigue(entity.getFatigue()+1);
        System.out.println("Moram jos uciti!!!");
    }

    @Override
    public void Exit(Student entity) {
        System.out.println("Student je prekinuo ucenje i ide na neku iducu akciju.");
    }
    
}
