/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants.  This class should not be used for any other purpose.  All constants should be
 * declared globally (i.e. public static).  Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class VariableVault {
//Drivetrain
    public static int  kDrivetrainleftMasterID = 0;
    public static int kDrivetrainleftSlaveID = 1;
    public static int kDrivetrainrightMasterID = 2;
    public static int kDrivetrainrightSlaveID = 3;
//Elevator
    public static int kElevatorMasterID = 4;
//Climb
    public static int kClimbMotorID = 0;

//Intake
    public static int kIntakeMotorID = 1;
    public static int kWristMotorID = 5;

/* DigitalInput ID */
    public static int kElevatorTopLimitID = 0;

/* Pneumatics ID */
//Drivetrain
    public static int kDrivetrainShifterForwardID = 0;
    public static int kDrivetrainShifterReverseID = 1;
//Elevator
    public static int kElevatorShifterForwardID = 2;
    public static int kElevatorShifterReverseID = 3;
//Climb
    public static int kClimbUpperForwardID = 4;
    public static int kClimbupperReverseID = 5;
    public static int kClimbLowerForwardID = 7;
    public static int kClimbLowerReverseID = 6;
    public static int kClimbFrontForwardID = 2;
    public static int kClimbFrontReverseID = 3;
    public static int kWristLockPistonForwardID = 0;
    public static int kWristLockPistonReverseID = 1;

}
