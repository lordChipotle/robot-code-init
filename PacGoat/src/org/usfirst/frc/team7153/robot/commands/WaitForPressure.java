/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team7153.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team7153.robot.Robot;

/**
 * Wait until the pneumatics are fully pressurized. This command does nothing
 * and is intended to be used in command groups to wait for this condition.
 */
public class WaitForPressure extends Command {
	public WaitForPressure() {
		requires(Robot.pneumatics);
	}

	// Make this return true when this Command no longer needs to run execute()
	@Override
	protected boolean isFinished() {
		return Robot.pneumatics.isPressurized();
	}
}
