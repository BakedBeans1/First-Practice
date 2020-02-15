/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.VictorSP;

import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import frc.robot.VariableVault;

public class Intake extends SubsystemBase {
  private final VariableVault vV = new VariableVault();
  private final VictorSP motor = new VictorSP(vV.kIntakeMotorID);
  private final WPI_TalonSRX wrist = new WPI_TalonSRX(vV.kWristMotorID);
  private final DoubleSolenoid lock = new DoubleSolenoid(vV.kWristLockPistonForwardID, vV.kWristLockPistonReverseID);

  /**
   * Creates a new Intake.
   */
  public Intake() {

    wrist.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative);

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void In() {
    motor.set(1);
  }

  public void Out() {
    motor.set(-1);
  }

  /**
   * StopI is stop intake
   */
  public void StopI() { 
    motor.set(0);
  }

  public void Up() {
    wrist.set(1);
  }

  public void Down() {
    wrist.set(-1);
  }
/**
 * StopW is stop wrist
 */
  public void StopW() { 
    wrist.set(0);
  }

}
