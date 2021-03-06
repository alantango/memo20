/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;

public class SpinAround extends CommandBase {
  /**
   * Creates a new SpinAround.
   */
  private Timer time;

  public SpinAround() {
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(Robot.m_spinner);
    time = new Timer();
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    time.start();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    Robot.m_spinner.stop();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return time.get() >= 10;  //again, another arbitrary number. Will need to adjust during testing
  }
}
