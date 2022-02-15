# For more information about using CMake with Android Studio, read the
# documentation: https://d.android.com/studio/projects/add-native-code.html

# Sets the minimum version of CMake required to build the native library.

cmake_minimum_required(VERSION  3.15.4)

# Declares and names the project.

project("radiantstodegrees")

SET(CMAKE_BUILD_TYPE Release)
SET(CMAKE_CXX_STANDARD 11)

# Need to create the .dylib and .jnilib files in order to run JUnit tests
if (APPLE)
    message("Apple Machine detected")

    set(JAVA_INCLUDE_PATH "$ENV{JAVA_HOME}/include;$ENV{JAVA_HOME}/include/darwin" )
    set(JAVA_INCLUDE_PATH2 "$ENV{JAVA_HOME}/include;$ENV{JAVA_HOME}/include/darwin" )
    set(JAVA_AWT_INCLUDE_PATH "$ENV{JAVA_HOME}/include;$ENV{JAVA_HOME}/include/darwin" )

    message(STATUS "JAVA_INCLUDE_PATH= ${JAVA_INCLUDE_PATH}")
    message(STATUS "JAVA_INCLUDE_PATH2= ${JAVA_INCLUDE_PATH2}")
    message(STATUS "JAVA_AWT_INCLUDE_PATH= ${JAVA_AWT_INCLUDE_PATH}")
    # Ensure jni.h is found
    find_package(JNI REQUIRED)
    include_directories(${JAVA_INCLUDE_PATH})
endif()

# Creates and names a library, sets it as either STATIC
# or SHARED, and provides the relative paths to its source code.
# You can define multiple libraries, and CMake builds them for you.
# Gradle automatically packages shared libraries with your APK.

add_library( # Sets the name of the library.
             radiantstodegrees

             # Sets the library as a shared library.
             SHARED

             # Provides a relative path to your source file(s).
             radiantstodegrees.cpp
             utils.cpp
        )


# Specifies libraries CMake should link to your target library. You
# can link multiple libraries, such as libraries you define in this
# build script, prebuilt third-party libraries, or system libraries.

target_link_libraries( # Specifies the target library.
                       radiantstodegrees)