package com.bailu.command;

public class Client {
    public static void main(String[] args) {
        //使用命令设计模式，完成通过遥控器对light的操作
        //创建电灯对象
        LightReceiver lightReceiver = new LightReceiver();
        //创建电灯遥控开关（即命令）
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);
        //创建一个遥控器
        RemoteController remoteController = new RemoteController();

        //使用遥控器进行light命令
        remoteController.setCommands(0, lightOnCommand, lightOffCommand);

        System.out.println("turn on...");
        remoteController.onButtonWasPushed(0);
        System.out.println("turn off...");
        remoteController.offButtonWasPushed(0);
        System.out.println("undo...");
        remoteController.undoButtonWasPushed();
    }
}
