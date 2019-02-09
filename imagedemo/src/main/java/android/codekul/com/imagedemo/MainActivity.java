package android.codekul.com.imagedemo;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.theartofdev.edmodo.cropper.CropImage;
import com.theartofdev.edmodo.cropper.CropImageView;

public class MainActivity extends AppCompatActivity {

    Button btnCapture;
    private ImageView imageView;
    private static final int MY_CAMERA_PERMISSION_CODE = 100;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCapture = findViewById(R.id.btbStart);
        imageView = findViewById(R.id.quick_start_cropped_image);
        btnCapture.setOnClickListener(new View.OnClickListener() {
                                          @RequiresApi(api = Build.VERSION_CODES.M)
                                          @Override
                                          public void onClick(View v) {
                                              if (checkSelfPermission(Manifest.permission.CAMERA)
                                                      != PackageManager.PERMISSION_GRANTED) {
                                                  requestPermissions(new String[]{Manifest.permission.CAMERA},
                                                          MY_CAMERA_PERMISSION_CODE);
                                              } else {
                                                 onSelectImageClick();
                                                  //Intent intent=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                                                  //startActivityForResult(intent,0);
                                              }
                                          }


                                      }
        );
    }

    public void onSelectImageClick() {
        CropImage.activity()
                .setGuidelines(CropImageView.Guidelines.ON)
                .setActivityTitle("My Crop")
                .setCropShape(CropImageView.CropShape.RECTANGLE)
                .setCropMenuCropButtonTitle("Done")
                .setRequestedSize(400, 400)
                .setCropMenuCropButtonIcon(R.drawable.ic_launcher_foreground)
                .start(this);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        // handle result of CropImageActivity
        if (requestCode == CropImage.CROP_IMAGE_ACTIVITY_REQUEST_CODE) {
            CropImage.ActivityResult result = CropImage.getActivityResult(data);
            if (resultCode == RESULT_OK) {
               // Bitmap bitmap=data.getExtras();
               // Toast.makeText(this, "width : "+bitmap.getWidth(), Toast.LENGTH_SHORT).show();
               // Toast.makeText(this, "hight : "+bitmap.getHeight(), Toast.LENGTH_SHORT).show();
                ((ImageView) findViewById(R.id.quick_start_cropped_image)).setImageURI(result.getUri());
                Toast.makeText(
                        this, "Cropping successful, Sample: " + result.getSampleSize(), Toast.LENGTH_LONG)
                        .show();
            } else if (resultCode == CropImage.CROP_IMAGE_ACTIVITY_RESULT_ERROR_CODE) {
                Toast.makeText(this, "Cropping failed: " + result.getError(), Toast.LENGTH_LONG).show();
            }
        }
       /* Bundle bundle=data.getExtras();
        Bitmap bitmapImage= (Bitmap) bundle.get("data");
        int nh = (int) ( bitmapImage.getHeight() * (512.0 / bitmapImage.getWidth()) );
        Bitmap scaled = Bitmap.createScaledBitmap(bitmapImage, 512, nh, true);
        imageView.setImageBitmap(scaled);*/
    }

}