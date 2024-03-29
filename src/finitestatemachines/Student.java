/*
 *
 */

package finitestatemachines;

/**
 *
 * @author User
 */
public class Student extends BaseGameEntity {
    
    private StateMachine stateMachine;
    private Location location;
    private int ectsAccumulated;
    private int barLearned;
    private int alreadyLearned;
    private int thirst;
    private int hunger;
    private int fatigue;
    
    public Student(int id)
    {
        super(id);
    }

    public Student(State currentState, State previousState, State globalState, Location location, int ectsAccumulated, int barLearned, int alreadyLearned, int thirst, int hunger, int fatigue, int id) {
        super(id);
        StateMachine sm = new StateMachine(this, currentState, previousState, globalState);
        this.stateMachine = sm;
        this.location = location;
        this.ectsAccumulated = ectsAccumulated;
        this.barLearned = barLearned;
        this.alreadyLearned = alreadyLearned;
        this.thirst = thirst;
        this.hunger = hunger;
        this.fatigue = fatigue;
    }
    
    @Override
    public void Update()
    {
        thirst += 2;
        hunger += 1;
        stateMachine.Update();
    }

    public Location getLocation() {
        return location;
    }

    public int getEctsAccumulated() {
        return ectsAccumulated;
    }

    public int getBarLearned() {
        return barLearned;
    }

    public int getAlreadyLearned() {
        return alreadyLearned;
    }

    public int getThirst() {
        return thirst;
    }

    public int getHunger() {
        return hunger;
    }

    public int getFatigue() {
        return fatigue;
    }

    public StateMachine getStateMachine() {
        return stateMachine;
    }

    public void setStateMachine(StateMachine stateMachine) {
        this.stateMachine = stateMachine;
    }
    
    public void setLocation(Location location) {
        this.location = location;
    }

    public void setEctsAccumulated(int ectsAccumulated) {
        this.ectsAccumulated = ectsAccumulated;
    }

    public void setBarLearned(int barLearned) {
        this.barLearned = barLearned;
    }

    public void setAlreadyLearned(int alreadyLearned) {
        this.alreadyLearned = alreadyLearned;
    }

    public void setThirst(int thirst) {
        this.thirst = thirst;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public void setFatigue(int fatigue) {
        this.fatigue = fatigue;
    }
    
}
