# Dillinger



# snap helper and center position recyclerview
### android recycler view  in center position libry  

## how to  use:
# Maven
 ```
 allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
	
  ```
# Gradle
 ```
 dependencies {
	        implementation 'com.github.vefghmhassan:snaphelperandcenterpositionrecyclerview:1.1'
	}
  ```
# Example Code
 ``` 
 
 CenterPosition.init().setRecyclerview(RecyclerView, LinearLayoutManager, new CenterPosition.getPosition() {
            @Override
            public void position(int pos) {
                // position center item recyclerview 
            }
        });
```  





