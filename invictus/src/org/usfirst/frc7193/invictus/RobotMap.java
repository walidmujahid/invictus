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
    public static WPI_TalonSRX cubeIntakeRightManipulatorDriveRMD1;
    public static WPI_TalonSRX cubeIntakeLeftManipulatorDriveLMD2;
    public static WPI_TalonSRX driveTrainRightFrontDriveRD1;
    public static WPI_TalonSRX driveTrainRightRearDriveRD2;
    public static SpeedControllerGroup driveTrainRightDrive;
    public static WPI_TalonSRX driveTrainLeftFrontDriveLD1;
    public static WPI_TalonSRX driveTrainLeftRearDriveLD2;
    public static SpeedControllerGroup driveTrainLeftDrive;
    public static DifferentialDrive driveTrainDrive;
    public static WPI_TalonSRX liftSpeedControllerLFT;
    public static DigitalInput liftTopLimitSwitch;
    public static DigitalInput liftBottomLimitSwitch;
    public static WPI_TalonSRX climbSpeedControllerCD1;
    public static DigitalInput climbTopLimitSwitch;
    public static DigitalInput climbBottomLimitSwitch;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        cubeIntakeRightManipulatorDriveRMD1 = new WPI_TalonSRX(5);
        cubeIntakeLeftManipulatorDriveLMD2 = new WPI_TalonSRX(6);
//        cubeIntakeLeftManipulatorDriveLMD2.configContinuousCurrentLimit(20, 0);
//        cubeIntakeLeftManipulatorDriveLMD2.configPeakCurrentLimit(21, 0);
//        cubeIntakeLeftManipulatorDriveLMD2.configPeakCurrentDuration(0, 0);
//        cubeIntakeLeftManipulatorDriveLMD2.enableCurrentLimit(true);
        cubeIntakeLeftManipulatorDriveLMD2.follow(cubeIntakeRightManipulatorDriveRMD1);
        cubeIntakeLeftManipulatorDriveLMD2.setInverted(true);
        
        
        driveTrainRightFrontDriveRD1 = new WPI_TalonSRX(1);
        
        
        driveTrainRightRearDriveRD2 = new WPI_TalonSRX(2);
        
        
        driveTrainRightDrive = new SpeedControllerGroup(driveTrainRightFrontDriveRD1, driveTrainRightRearDriveRD2  );
        LiveWindow.addActuator("DriveTrain", "RightDrive", driveTrainRightDrive);
        
        driveTrainLeftFrontDriveLD1 = new WPI_TalonSRX(3);
        
        
        driveTrainLeftRearDriveLD2 = new WPI_TalonSRX(4);
        
        
        driveTrainLeftDrive = new SpeedControllerGroup(driveTrainLeftFrontDriveLD1, driveTrainLeftRearDriveLD2  );
        LiveWindow.addActuator("DriveTrain", "LeftDrive", driveTrainLeftDrive);
        
        driveTrainDrive = new DifferentialDrive(driveTrainLeftDrive, driveTrainRightDrive);
        LiveWindow.addActuator("DriveTrain", "Drive", driveTrainDrive);
        driveTrainDrive.setSafetyEnabled(true);
        driveTrainDrive.setExpiration(0.1);
        driveTrainDrive.setMaxOutput(1.0);

        liftSpeedControllerLFT = new WPI_TalonSRX(7);
        
        
        liftTopLimitSwitch = new DigitalInput(0);
        LiveWindow.addSensor("Lift", "TopLimitSwitch", liftTopLimitSwitch);
        
        liftBottomLimitSwitch = new DigitalInput(1);
        LiveWindow.addSensor("Lift", "BottomLimitSwitch", liftBottomLimitSwitch);
        
        climbSpeedControllerCD1 = new WPI_TalonSRX(8);
        
        
        climbTopLimitSwitch = new DigitalInput(2);
        LiveWindow.addSensor("Climb", "TopLimitSwitch", climbTopLimitSwitch);
        
        climbBottomLimitSwitch = new DigitalInput(3);
        LiveWindow.addSensor("Climb", "BottomLimitSwitch", climbBottomLimitSwitch);
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
