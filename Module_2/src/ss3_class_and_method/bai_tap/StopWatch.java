package ss3_class_and_method.bai_tap;

public class StopWatch {
    private long startTime;
    private long endTime;

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public StopWatch() {

    }
    void start(){
        this.startTime = System.currentTimeMillis();
    }
    void stop(){
        this.endTime = System.currentTimeMillis();
    }
    public long getElapsedTime(){
        return this.getEndTime() - this.getStartTime();
    }


    public static void main(String[] args) {
        int sum = 0;
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        for(int i = 0; i < 1000000; i++){
            sum = (int) Math.sqrt(i);
        };
        System.out.println(stopWatch.getStartTime());
        stopWatch.stop();
        System.out.println(stopWatch.getEndTime());
        System.out.println(stopWatch.getElapsedTime());
    }
}
