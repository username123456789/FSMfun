/*

 */

package finitestatemachines;

/**
 *
 * @author User
 */
public interface State {
    
    public void Enter (Student entity);
    
    public void Execute(Student entity);
    
    public void Exit(Student entity);
}
