package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.HardwareMap;

import java.io.Console;

import FTCEngine.Core.Behavior;
import FTCEngine.Core.Main;

public class TestBehavior extends Behavior
{
	public TestBehavior(Main opMode)
	{
		super(opMode);
	}

	@Override
	public void awake(HardwareMap hardwareMap)
	{
		super.awake(hardwareMap);

		telemetry.addData("AWAKE!", "YAYAY");
		System.out.println("AWAKE!");
	}

	@Override
	public void start()
	{
		super.start();

		telemetry.addData("START!", "YEAH");
		telemetry.addData("oh", opMode.getBehavior(OhDrive.class));

		System.out.println("START!");
		System.out.println(opMode.getBehavior(OhDrive.class));
	}

	@Override
	public void update()
	{
		super.update();

		telemetry.addData("DELTA TIME!", time.getDeltaTime());
		telemetry.addData("TOTAL TIME!", time.getTime());

		System.out.println("D time: " + time.getDeltaTime() + "total t" + time.getTime());
	}

	@Override
	public void stop()
	{
		super.stop();

		telemetry.addData("STOP!", "NOoooo");
	}
}
