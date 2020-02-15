/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.commands.IntakeIn;
import frc.robot.subsystems.Climber;
import frc.robot.subsystems.Drivetrain;
import frc.robot.subsystems.Elevator;
import frc.robot.subsystems.Intake;
import frc.robot.subsystems.Vision;
import edu.wpi.first.wpilibj.Joystick;
import frc.robot.commands.*;

/**
 * This class is where the bulk of the robot should be declared.  Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls).  Instead, the structure of the robot
 * (including subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  private final Climber sClimber = new Climber();
  private final Drivetrain sDrivetrain = new Drivetrain();
  private final Elevator sElevator = new Elevator();
  private final Intake sIntake = new Intake();
  private final Vision sVision = new Vision();

  private static final Joystick OpStick = new Joystick(0);
  private static final Joystick CoopStick = new Joystick(1);
  
  private static JoystickButton IntakeInButton;
  private static JoystickButton IntakeOutButton;
  private static JoystickButton WristUpButton;
  private static JoystickButton WristDownButton;



  /**
   * The container for the robot.  Contains subsystems, OI devices, and commands.
   */
  public RobotContainer() {
    // Configure the button bindings
    configureButtonBindings();
  }

  /**
   * Use this method to define your button->command mappings.  Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a
   * {@link edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {

    IntakeInButton = new JoystickButton(CoopStick, 8);
    IntakeInButton.whileHeld(new IntakeIn(sIntake));

    IntakeOutButton = new JoystickButton(CoopStick, 7);
    IntakeInButton.whileHeld(new IntakeOut(sIntake));

    WristUpButton = new JoystickButton(CoopStick, 5);
    WristUpButton.whileHeld(new WristUp(sIntake));

    WristDownButton = new JoystickButton(CoopStick, 6);
    WristDownButton.whileHeld(new WristDown(sIntake));
  }


  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    return new Auto(sDrivetrain);
  }
  public static Joystick getOpStick(){
    return OpStick;
  }
}
