/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import frc.robot.VariableVault;

public class Climber extends SubsystemBase {
  private final VariableVault vV = new VariableVault();
  private final VictorSP Motor = new VictorSP(vV.kClimbMotorID);
  private final DoubleSolenoid upper = new DoubleSolenoid(vV.kClimbUpperForwardID, vV.kClimbupperReverseID);
  private final DoubleSolenoid lower = new DoubleSolenoid(vV.kClimbLowerForwardID, vV.kClimbLowerReverseID);
  /**
   * Creates a new Climber.
   */
  public Climber() {
    Motor.setInverted(true);
    Motor.setSubsystem("Climber");
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
