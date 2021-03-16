// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.InstantCommand;
import frc.robot.subsystems.ShooterSub;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

/** Add your docs here. */
public class GetAdjusterHeight extends InstantCommand {
  /** Add your docs here. */
  public int CurrentHeight;
  public WPI_TalonSRX Shooter_Motor3;

  public GetAdjusterHeight() {
    super();
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    requires(ShooterSub.getInstance());
  }

  // Called once when the command executes
  @Override
  protected void initialize() {
    CurrentHeight = Shooter_Motor3.getSelectedSensorPosition();
    System.out.print(CurrentHeight);
  }
}
