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
        entity.setFatigue(0);
        System.out.println("ZZZZZ... ZZZZZ...!");
    }

    @Override
    public void Exit(Student entity) {
        System.out.println("Student se budi odmoran i spreman za nove pobjede!");
    }
    
}
