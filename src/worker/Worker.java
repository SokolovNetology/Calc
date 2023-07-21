package worker;

public class Worker {
    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;
    public Worker(OnTaskDoneListener callback) {
        this.callback = callback;
        public void start() {
            for (int i = 0; i < 100; i++) {
                callback.onDone("Task " + i + " is done");
            }
            Worker(OnTaskErrorListener errorCallback){
                public void stop() {
                    for (int i = 0; i < 100; i++) {
                        errorCallback.onError("Task " + i + " error");
        }
    }
}
