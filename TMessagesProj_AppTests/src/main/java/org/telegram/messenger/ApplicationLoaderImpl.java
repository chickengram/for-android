package com.chickengram.messenger;

public class ApplicationLoaderImpl extends ApplicationLoader {
    @Override
    protected boolean isAndroidTestEnv() {
        return true;
    }
}
