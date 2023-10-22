package main_sub;

class MainProgram {
    public void execute() {
        System.out.println("主程序执行");
        // 调用子程序
        SubProgram subProgram = new SubProgram();
        subProgram.execute();
    }
}