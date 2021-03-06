package edu.ggc.it.gym;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import edu.ggc.it.R;


public class GroupsActivity extends Activity {
	private Button muscle1;
	private Button bootCamp;
	private Button Strength;
	private Button yogaletes;
	private Button interval1;
	private Button interval2;
	private Button muscle2;
	private Button bootcamp2;
	private Button kickboxing;
	private Button yoga;
	private Button interval3;
	private Context myContext;
	
	@Override
	/***************************************************************************
	 * this method creates all of the buttons
	 **************************************************************************/

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_groups);

		myContext = this;


		muscle1 = (Button) findViewById(R.id.Muscle1);
		muscle1.setOnClickListener(new ButtonListener());

		bootCamp = (Button) findViewById(R.id.camp1);
		bootCamp.setOnClickListener(new ButtonListener());

		Strength = (Button) findViewById(R.id.strength);
		Strength.setOnClickListener(new ButtonListener());

		yogaletes = (Button) findViewById(R.id.letes);

		yogaletes.setOnClickListener(new ButtonListener());

		interval1 = (Button) findViewById(R.id.interval1);
		interval1.setOnClickListener(new ButtonListener());

		interval2 = (Button) findViewById(R.id.interval2);
		interval2.setOnClickListener(new ButtonListener());

		interval3 = (Button) findViewById(R.id.interval3);
		interval3.setOnClickListener(new ButtonListener());


		muscle2 = (Button) findViewById(R.id.Muscle2);
		muscle2.setOnClickListener(new ButtonListener());

		bootcamp2 = (Button) findViewById(R.id.camp2);
		bootcamp2.setOnClickListener(new ButtonListener());

		kickboxing = (Button) findViewById(R.id.kickboxing);
		kickboxing.setOnClickListener(new ButtonListener());

		muscle2 = (Button) findViewById(R.id.Muscle2);
		muscle2.setOnClickListener(new ButtonListener());

		bootcamp2 = (Button) findViewById(R.id.camp2);
		bootcamp2.setOnClickListener(new ButtonListener());

		kickboxing = (Button) findViewById(R.id.kickboxing);
		kickboxing.setOnClickListener(new ButtonListener());


		yoga = (Button) findViewById(R.id.yoga);
		yoga.setOnClickListener(new ButtonListener());
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_groups, menu);
		return true;
	}
	/*************************************************************************
	 * Button listener shows the descriptions of each of the buttons when a button is clicked
	 *************************************************************************** */
	public class ButtonListener implements OnClickListener {
		public void onClick(View view) {

			if (view.getId() == R.id.Muscle1 || view.getId() == R.id.Muscle2){
				muscleDesc();				
			}
			else if (view.getId() == R.id.camp1 || view.getId() == R.id.camp2){
				bootDesc();
			}
			else if (view.getId() == R.id.letes){

			if (view.getId() == R.id.Muscle1 || view.getId() == R.id.Muscle2){
				muscleDesc();				
			}
			else if (view.getId() == R.id.camp1 || view.getId() == R.id.camp2){
				bootDesc();
			}
			else if (view.getId() == R.id.letes){

				yogaletesDesc();
			}
			else if (view.getId() == R.id.yoga){
				yogaDesc();
			}
			else if (view.getId() == R.id.interval1 || view.getId() == R.id.interval2 || view.getId() == R.id.interval3){
				intervalDesc();
			}
			else if (view.getId() == R.id.kickboxing) {
				kickDesc();
			}

			else if (view.getId() == R.id.strength) {

				strengthDesc();
			}

		}

	}
	
	/*************************************************************************
	 * Shows the description of the MUSCLE STRENGTHING class
	 *************************************************************************** */
	
	public void muscleDesc() {

		AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(myContext);
		// set dialog message;
		alertDialogBuilder
		.setMessage("Tone and build muscle mass utilizing different resistance tools.");
		AlertDialog alertDialog = alertDialogBuilder.create();

		// show it
		alertDialog.show();
	}

	/*************************************************************************
	 * Shows the description of the BOOT CAMP class
	 *************************************************************************** */
	
	public void bootDesc() {

		AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(myContext);
		// set dialog message;
		alertDialogBuilder
		.setMessage("Boot camp is a group exercise class that mixes traditional calisthenics and body weight exercises with interval training and strength training.");
		AlertDialog alertDialog = alertDialogBuilder.create();
		// show it
		alertDialog.show();
	}

	/*************************************************************************
	 * Shows the description of the YOGALETES class
	 *************************************************************************** */
	
	public void yogaletesDesc() {

		AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(myContext);
		// set dialog message;
		alertDialogBuilder
		.setMessage("Combines Yoga and Pilates");
		AlertDialog alertDialog = alertDialogBuilder.create();
		// show it
		alertDialog.show();
	}

	/*************************************************************************
	 * Shows the description of the YOGA class
	 *************************************************************************** */
	
	public void yogaDesc() {

		AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(myContext);
		// set dialog message;
		alertDialogBuilder
		.setMessage("Appropriate for the beginner who wants to build a strong foundation of basic Yoga postures and breathing techniques, as well as for the practitioner who wants to refine and master the fundamentals. It is an invitation to stretch, relax, unwind and de-stress.");
		AlertDialog alertDialog = alertDialogBuilder.create();
		// show it
		alertDialog.show();
	}

	/*************************************************************************
	 * Shows the description of the interval training class
	 *************************************************************************** */
	
	public void intervalDesc() {

		AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(myContext);
		// set dialog message;
		alertDialogBuilder
		.setMessage("A great cardio & strength training workout.");
		AlertDialog alertDialog = alertDialogBuilder.create();
		// show it
		alertDialog.show();
	}

	/*************************************************************************
		Shows the description of the KICKBOXING class
	 *************************************************************************** */
	
	public void kickDesc() {

		AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(myContext);
		// set dialog message;
		alertDialogBuilder
		.setMessage("Martial arts-inspired interval workout that combines kickboxing with athletic drills.");
		AlertDialog alertDialog = alertDialogBuilder.create();
		// show it
		alertDialog.show();
	}

	/*************************************************************************
	 * Shows the description of the Strength class
	 *************************************************************************** */
	
	public void strengthDesc() {

		AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(myContext);
		// set dialog message;
		alertDialogBuilder
		.setMessage("This interval training routine blends strength and cardio alternating circuits using body weight, a variety of equipment and partner work. The circuit training workout is loaded with functional exercises designed to give you the ultimate challenge.");
		AlertDialog alertDialog = alertDialogBuilder.create();
		// show it
		alertDialog.show();
	}

}
	}
