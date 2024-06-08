package com.cryptomorin.xseries.reflection.minecraft;

import com.cryptomorin.xseries.reflection.jvm.classes.DynamicClassHandle;
import com.cryptomorin.xseries.reflection.jvm.classes.PackageHandle;
import org.intellij.lang.annotations.Pattern;
import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Experimental
public class MinecraftClassHandle extends DynamicClassHandle {
    public MinecraftClassHandle inPackage(MinecraftPackage minecraftPackage) {
        super.inPackage(minecraftPackage);
        return this;
    }

    public MinecraftClassHandle inPackage(MinecraftPackage minecraftPackage, @Pattern(PackageHandle.JAVA_PACKAGE_PATTERN) String packageName) {
        super.inPackage(minecraftPackage, packageName);
        return this;
    }

    public MinecraftClassHandle named(@Pattern(PackageHandle.JAVA_IDENTIFIER_PATTERN) String... clazzNames) {
        super.named(clazzNames);
        return this;
    }

    public MinecraftClassHandle map(MinecraftMapping mapping, @Pattern(PackageHandle.JAVA_IDENTIFIER_PATTERN) String className) {
        this.classNames.add(className);
        return this;
    }
}
