package org.firstinspires.ftc.teamcode;

import java.util.List;

import FTCEngine.Core.Behavior;
import FTCEngine.Core.Main;

public class TestOp extends Main
{
	@Override
	public void addBehaviors(List<Behavior> behaviorList)
	{
		behaviorList.add(new OhDrive(this));
	}
}
