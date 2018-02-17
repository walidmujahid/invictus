// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc7193.invictus;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.CANTalon;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static WPI_TalonSRX cubeIntakeRMD1;
    public static WPI_TalonSRX cubeIntakeLMD2;
    public static SpeedControllerGroup cubeIntakeIntakeMotors;
    public static WPI_TalonSRX driveTrainRD1;
    public static WPI_TalonSRX driveTrainRD2;
    public static SpeedControllerGroup driveTrainRightDrive;
    public static WPI_TalonSRX driveTrainLD1;
    public static WPI_TalonSRX driveTrainLD2;
    public static SpeedControllerGroup driveTrainLeftDrive;
    public static DifferentialDrive driveTrainDrive;
    public static WPI_TalonSRX liftLFT;
    public static DigitalInput liftLiftTopLimit;
    public static DigitalInput liftLiftBottomLimit;
    public static WPI_TalonSRX climbCD1;
    public static DigitalInput climbClimbTopLimit;
    public static DigitalInput climbClimbBottomLimit;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        cubeIntakeRMD1 = new WPI_TalonSRX(5);
        
        
        cubeIntakeLMD2 = new WPI_TalonSRX(6);
        
        
        cubeIntakeIntakeMotors = new SpeedControllerGroup(cubeIntakeRMD1, cubeIntakeLMD2  );
        LiveWindow.addActuator("CubeIntake", "IntakeMotors", cubeIntakeIntakeMotors);
        
        driveTrainRD1 = new WPI_TalonSRX(1);
        
        
        driveTrainRD2 = new WPI_TalonSRX(2);
        
        
        driveTrainRightDrive = new SpeedControllerGroup(driveTrainRD1, driveTrainRD2  );
        LiveWindow.addActuator("DriveTrain", "RightDrive", driveTrainRightDrive);
        
        driveTrainLD1 = new WPI_TalonSRX(3);
        
        
        driveTrainLD2 = new WPI_TalonSRX(4);
        
        
        driveTrainLeftDrive = new SpeedControllerGroup(driveTrainLD1, driveTrainLD2  );
        LiveWindow.addActuator("DriveTrain", "LeftDrive", driveTrainLeftDrive);
        
        driveTrainDrive = new DifferentialDrive(driveTrainLeftDrive, driveTrainRightDrive);
        LiveWindow.addActuator("DriveTrain", "Drive", driveTrainDrive);
        driveTrainDrive.setSafetyEnabled(true);
        driveTrainDrive.setExpiration(0.1);
        driveTrainDrive.setMaxOutput(1.0);

        liftLFT = new WPI_TalonSRX(7);
        
        
        liftLiftTopLimit = new DigitalInput(0);
        LiveWindow.addSensor("Lift", "LiftTopLimit", liftLiftTopLimit);
        
        liftLiftBottomLimit = new DigitalInput(1);
        LiveWindow.addSensor("Lift", "LiftBottomLimit", liftLiftBottomLimit);
        
        climbCD1 = new WPI_TalonSRX(8);
        
        
        climbClimbTopLimit = new DigitalInput(2);
        LiveWindow.addSensor("Climb", "ClimbTopLimit", climbClimbTopLimit);
        
        climbClimbBottomLimit = new DigitalInput(3);
        LiveWindow.addSensor("Climb", "ClimbBottomLimit", climbClimbBottomLimit);
        

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
