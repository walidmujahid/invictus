// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc7193.invictus.subsystems;

import org.usfirst.frc7193.invictus.RobotMap;
import org.usfirst.frc7193.invictus.commands.*;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import edu.wpi.first.wpilibj.Joystick;
import com.ctre.phoenix.motorcontrol.ControlMode;
// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.DigitalInput;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS


/**
 *
 */
public class Climb extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final WPI_TalonSRX speedControllerCD1 = RobotMap.climbSpeedControllerCD1;
    private final DigitalInput topLimitSwitch = RobotMap.climbTopLimitSwitch;
    private final DigitalInput bottomLimitSwitch = RobotMap.climbBottomLimitSwitch;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    @Override
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new TestMoveClimb());
    }

    @Override
    public void periodic() {
        // Put code here to be run every loop

    }

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    
    
    public void StartMotor() {
    	speedControllerCD1.set(ControlMode.PercentOutput, 0.1);
	}

	public void RunMotorAtSetSpeed(Joystick joystick) {
		double posThreshold = 0.05;  //default threshold value from xBox Controller
		double dblPositive = joystick.getY();       

		//display on dashboards
		SmartDashboard.putNumber("Motor Speed: ", dblPositive);

		//Positive motor rotation
		if(Math.abs(dblPositive) > posThreshold) {
			speedControllerCD1.set(ControlMode.PercentOutput,dblPositive);
		}
		else {
			speedControllerCD1.set(ControlMode.PercentOutput,0.0);
		}

	}

	public void StopMotor() {
		speedControllerCD1.set(ControlMode.PercentOutput, 0.0);
	}


}

