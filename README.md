# Animated-Star-Rating

[![Version](https://img.shields.io/badge/Version-0.0.1-brightgreen.svg)](https://github.com/zelin/Animated-Star-Rating)
[![Platform](https://img.shields.io/badge/Platform-Android-orange.svg)](https://github.com/zelin/Animated-Star-Rating)
[![License](https://img.shields.io/badge/License-MIT-black.svg)](https://github.com/zelin/Animated-Star-Rating)
[![Donate Bitcoin](https://img.shields.io/badge/Donate-Bitcoin-green.svg)](http://neberox.tk/donate/?amount=2&currency=USD)

![Screenshot 1](./Screenshots/image_1.jpg)
![Screenshot 2](./Screenshots/image_2.jpg)

## Installation

The easiest way to add the library to your project is by adding it as a dependency to your build.gradle

```ruby
dependencies {
   implementation 'com.neberox.library:animatedstar:0.0.1'
}
```

## Usage

### Using XML

 ```
  <com.neberox.library.animatedstar.StarRatingBar
        xmlns:app="http://schemas.android.com/apk/res-auto"
        android:layout_width="250dp"
        android:layout_height="250dp"
        android:layout_centerInParent="true"
        app:textPadding="0.5"
        />

```

### Create StarRatingBar programmatically

```java
        
StarRatingBar bar = new StarRatingBar(this);
mainLayout.addView(bar, params);

bar.setAnimDuration(200);
bar.setFillColor(Color.WHITE);
bar.setRating(3);
bar.setSelectedColor(Color.parseColor("#FF00000"));
bar.setStrokeColor(Color.TRANSPARENT);
bar.setStrokeWidth(1);
        
bar.regenerateStar();

```

## Attributes

| Name | Description |
| ------ | ------ |
| strokeColor(optional) | Stroke outside each corner. Available only for non rated points |
| strokeWidth(optional) | Size of the outer stroke |
| fillColor(optional) | Color of un rated points of star |
| selectedColor | Color of the rated points of star  |
| textColor(optional) | Color of the text written on each point of star indicating rating |
| textPadding(optional) | Determines where the text will be drawn either close to corner (1) or close to middle (0). Range 0->1  |
| textSize(optional) | Text font size |
| selectedTextColor(optional) | Color of text drawn over the rated points of star |

## Author

Muhammad Umar, https://github.com/zelin

## License

Animated-Star-Rating is available under the MIT license. See the LICENSE file for more info.
