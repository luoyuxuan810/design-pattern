public class RunnableState extends ThreadState{
    public RunnableState() {
        state = StateSet.RUNNABLE;
        System.out.println("就绪状态");
    }
    public void getCpu(ThreadContext tc){
        System.out.println("获得CPU时间");
        if (state == StateSet.RUNNABLE)
            tc.setThreadState(new RunningState());
        else
            System.out.println("当前状态不是就绪状态");
    }
}
