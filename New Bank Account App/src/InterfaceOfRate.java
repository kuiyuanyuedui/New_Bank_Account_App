/**
 * This interface contains all operations that all related objects should support
 */
public interface InterfaceOfRate {
    /**
     * Method getBaseRate will set up the base rate
     * @return the base rate with 2.5
     */
    default double getBaseRate(){
        return 2.5;
    }
}
