package interfaces;

public interface Work {
    /**
     * Метод - делать работу.
     * @param task - задача, в нашем случае просто строка.
     */
    void doWork(String task);

    /**
     * Метод - отдыхать.
     */
    void rest();

}
