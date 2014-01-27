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
public class SimulationThread extends Thread {
    @Override
    public void run()
    {
        Student s = new Student(new LearningState(), new EatingState(), null, Location.PERSONAL_ROOM, 0, 20, 0, 0, 0, 0, 1);
        while(true)
        {
            s.Update();
            try{
                sleep(1500);
            }catch(InterruptedException ex)
            {
                System.err.println(ex.getMessage());
            }
        }
    }
}
