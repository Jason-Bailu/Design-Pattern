package com.bailu.command;

public class RemoteController {
    //开
    Command[] onCommands;
    //关
    Command[] offCommands;
    //撤销
    Command undoCommand;

    //初始化
    public RemoteController() {
        onCommands = new Command[5];
        offCommands = new Command[5];

        for (int i = 0; i < 5; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    //设置开关
    public void setCommands(int no, Command onCommand, Command offCommand) {
        onCommands[no] = onCommand;
        //记录按下的开关
        offCommands[no] = offCommand;
    }

    //按下开
    public void  onButtonWasPushed(int no) {
        onCommands[no].execute();
        undoCommand = onCommands[no];
    }

    //按下关
    public void offButtonWasPushed(int no) {
        offCommands[no].execute();
        undoCommand = offCommands[no];
    }

    //按下撤销
    public void undoButtonWasPushed() {
        if (undoCommand != null) {
            undoCommand.undo();
        }
    }
}
