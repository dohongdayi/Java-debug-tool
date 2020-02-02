//
//  ========================================================================
//  Copyright (c) 2018-2019 HuJian/Pandening soft collection.
//  ------------------------------------------------------------------------
//  All rights reserved. This program and the accompanying materials
//  are made available under the terms of the #{license} Public License #{version}
//  EG:
//      The Eclipse Public License is available at
//      http://www.eclipse.org/legal/epl-v10.html
//
//      The Apache License v2.0 is available at
//      http://www.opensource.org/licenses/apache2.0.php
//
//  You may elect to redistribute this code under either of these licenses.
//  You should bear the consequences of using the software (named 'java-debug-tool')
//  and any modify must be create an new pull request and attach an text to describe
//  the change detail.
//  ========================================================================
//


/**
 *   Copyright © 2019-XXX HJ All Rights Reserved
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
//  Author : HJ


public class LambdaTest {

    public static void main(String[] args) {

        System.out.println("ladmba test\n");

        testLambda();

    }

    private static void testLambda() {
        // dump the inner class
        System.setProperty("jdk.internal.lambda.dumpProxyClasses", "/Users/hujian06/github/java-debug-tool/test/src/main/java");

        // lambda
        new Thread(() -> System.out.println("hello")).start();
    }

}
