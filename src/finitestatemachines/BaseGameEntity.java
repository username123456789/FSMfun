/*
 *
 */

package finitestatemachines;

/**
 *
 * @author User
 */
public class BaseGameEntity {
    
        private int ID;
        private static int nextValidID;
        
        public BaseGameEntity(int id)
        {
            ID = id;
        }
        
        public int getID()
        {
            return ID;
        }
        
        public void Update(){
            
        }
    
}
