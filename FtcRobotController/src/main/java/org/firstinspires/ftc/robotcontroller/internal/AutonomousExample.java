package org.firstinspires.ftc.robotcontroller.internal;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;


@Autonomous(name = "Autonomous Test", group = "Linear OpMode")

public class AutonomousExample extends LinearOpMode {

    private DcMotor leftMotor = null;
    private DcMotor rightMotor = null;

    @Override
    public void runOpMode() throws InterruptedException {

        leftMotor = hardwareMap.dcMotor.get("left_motor");
        rightMotor = hardwareMap.dcMotor.get("right_motor");

        waitForStart();

        if (opModeIsActive()){
            leftMotor.setPower(0.5);
            rightMotor.setPower(0.5);
            sleep(2000);
            leftMotor.setPower(0);
            rightMotor.setPower(0);

            telemetry.addData("Status","Finished");
            telemetry.update();
        }
    }


}
