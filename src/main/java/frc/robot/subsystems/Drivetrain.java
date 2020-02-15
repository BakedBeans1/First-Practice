/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.VariableVault;
import edu.wpi.first.wpilibj.Joystick;
import frc.robot.RobotContainer;

public class Drivetrain extends SubsystemBase {
  private final VariableVault vV = new VariableVault();
  private final WPI_TalonSRX leftMaster = new WPI_TalonSRX(vV.kDrivetrainleftMasterID); 
  private final WPI_TalonSRX rightMaster = new WPI_TalonSRX(vV.kDrivetrainrightMasterID);
  private final WPI_TalonSRX leftSlave = new WPI_TalonSRX(vV.kDrivetrainleftSlaveID);
  private final WPI_TalonSRX rightSlave = new WPI_TalonSRX(vV.kDrivetrainrightSlaveID);

  private final DifferentialDrive drive = new DifferentialDrive(leftMaster, rightMaster);

  private final DoubleSolenoid shift = new DoubleSolenoid(vV.kDrivetrainShifterForwardID, vV.kDrivetrainShifterReverseID);

  /**
   * Creates a new Drivetrain.
   */
  public Drivetrain() {
    leftMaster.configSelectedFeedbackSensor(FeedbackDevice.QuadEncoder);
    leftMaster.setSubsystem("Drivetrain");
    rightMaster.configSelectedFeedbackSensor(FeedbackDevice.QuadEncoder);
    rightMaster.setSubsystem("Drivetrain");
    leftSlave.follow(leftMaster);
    leftSlave.setSubsystem("Drivetrain");
    rightSlave.follow(rightMaster);
    rightSlave.setSubsystem("Drivetrain");
  }

  @Override
  public void periodic() {
    OperatorDrive(RobotContainer.getOpStick());
  }

  public void OperatorDrive(Joystick stick) {
    drive.arcadeDrive(-stick.getY(), -stick.getZ());
  }

}
