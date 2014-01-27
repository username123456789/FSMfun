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
public class TakingTestsState implements State {

    @Override
    public void Enter(Student entity) {
        if(entity.getLocation() != Location.COLLEGE)
        {
            entity.setLocation(Location.COLLEGE);
            System.out.println("Student je naucio sve i ide na fax da polaze ispite!");
        }
    }

    @Override
    public void Execute(Student entity) {
        entity.setEctsAccumulated(entity.getEctsAccumulated()+5);
        entity.setFatigue(entity.getFatigue()+1);
        System.out.println("Sabijanje na ispitima neizmjerno!");
    }

    @Override
    public void Exit(Student entity) {
        System.out.println("Ispiti su zavrsili!");
    }
    
}
