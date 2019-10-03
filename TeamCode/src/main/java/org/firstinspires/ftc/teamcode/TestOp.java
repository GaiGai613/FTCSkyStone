package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import java.util.List;

import FTCEngine.Core.Behavior;
import FTCEngine.Core.Main;

@TeleOp(name = "SOMETHING THAT SHOULD")
public class TestOp extends LinearOpMode
{
//	@Override
//	public void addBehaviors(List<Behavior> behaviorList)
//	{
////		behaviorList.add(new OhDrive(this));
////		behaviorList.add(new TestBehavior(this));
//	}


	@Override
	public void runOpMode() throws InterruptedException
	{
		waitForStart();

		while (opModeIsActive())
		{
			telemetry.addData("HA", "LOL");
			telemetry.update();
		}
	}
}