# ButtonClickCounter
Simple Android App that keeps count of times button is tapped

This a simple App created for Android that tracks how many times a button is clicked. This app I created following a course I am currently taking on Android Development.

This a simple app that uses boolean logic, variables and functions/methods.

Example, this code displays a message when the settings button is tapped: 

```java
    if (id == R.id.action_settings) {
            Toast toastMessage = Toast.makeText(this, "Text value is now " + ourMessage.getText(), Toast.LENGTH_LONG); 
            toastMessage.show();
            numTimesClicked = 0; //reset the counter

            return true;
        }
 ```

Another example of when the button is tapped: 

```java
     View.OnClickListener ourOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numTimesClicked = numTimesClicked + 1;
                String result = "The button got tapped " + numTimesClicked + " time";
                if (numTimesClicked != 1) { 
                    result +="s..."; 
                }
                ourMessage.setText(result);
            }

        };
        ourButton.setOnClickListener(ourOnClickListener);
    }
```


This is my first Android app :). Super excited to be developing in Android.
