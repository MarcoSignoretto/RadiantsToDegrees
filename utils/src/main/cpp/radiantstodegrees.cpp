#include <jni.h>
#include <string>
#include "utils.h"

extern "C" JNIEXPORT jstring JNICALL
Java_com_msignoretto_radiantstodegrees__utils_NativeLib_stringFromJNI(
        JNIEnv* env,
        jobject /* this */) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}
extern "C"
JNIEXPORT jdouble JNICALL
Java_com_msignoretto_radiantstodegrees_utils_Utils_toDegree(JNIEnv *env, jobject thiz,
                                                            jdouble radiants) {
    return to_degree(radiants);
}