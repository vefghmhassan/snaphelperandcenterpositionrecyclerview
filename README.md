# snaphelperandcenterpositionrecyclerview
android recycler view  in center position libry  

how to  use:

step 1:
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  step 2: 
  implementation 'com.github.vefghmhassan:snaphelperandcenterpositionrecyclerview:1.1'
  step 3:
  CenterPosition.init().setRecyclerview(RecyclerView, LinearLayoutManager, new CenterPosition.getPosition() {
            @Override
            public void position(int pos) {
                // position center item recyclerview 
            }
        });
