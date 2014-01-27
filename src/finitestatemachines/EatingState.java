/*
 * 
 */

package finitestatemachines;

/**
 *
 * @author User
 */
public class EatingState implements State {

    @Override
    public void Enter(Student entity) {
        if(entity.getLocation() != Location.KITCHEN)
        {
            entity.setLocation(Location.KITCHEN);
            System.out.println("Student je ogladnio i ide u kuhinju da jede");
        }
    }

    @Override
    public void Execute(Student entity) {
        entity.setHunger(0);
        System.out.println("Njam njam njam njam! Pretpah se ovim bijesnim sendvicima!");
    }

    @Override
    public void Exit(Student entity) {
        System.out.println("Student je zavrsio s jelom.");
    }
    
}
