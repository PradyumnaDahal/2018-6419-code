package org.usfirst.frc.team6419.robot.subsystems;

import org.usfirst.frc.team6419.robot.RobotMap;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
 /*
 */
public class Chassis extends Subsystem {
	 VictorSP leftDrive1;
	 VictorSP leftDrive2;
	 VictorSP rightDrive1;
	 VictorSP rightDrive2;
	 SpeedControllerGroup left, right;
    DifferentialDrive drive;
	 // Put methods for controlling this subsystem
    // here. Call these from Commands.
	public Chassis() {
		leftDrive1 = new VictorSP(RobotMap.LEFT_DRIVE_MOTOR_1);
		leftDrive2 = new VictorSP(RobotMap.LEFT_DRIVE_MOTOR_1);
		rightDrive1 = new VictorSP(RobotMap.LEFT_DRIVE_MOTOR_1);
		rightDrive2 = new VictorSP(RobotMap.LEFT_DRIVE_MOTOR_1);
		rightDrive1.setInverted(true);
		leftDrive2.setInverted(true);
		left = new SpeedControllerGroup(leftDrive1, rightDrive2);
		right = new SpeedControllerGroup(leftDrive2, rightDrive1);
		drive = new DifferentialDrive(left, right);
	}
	
    public void initDefaultCommand() {
        
    	// Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void tankDrive(double speedLeft, double speedRight) {
    	drive.tankDrive(speedLeft, speedRight);
    }
    
}

