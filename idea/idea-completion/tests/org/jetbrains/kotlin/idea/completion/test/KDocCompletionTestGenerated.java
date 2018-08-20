/*
 * Copyright 2010-2019 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.completion.test;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("idea/idea-completion/testData/kdoc")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class KDocCompletionTestGenerated extends AbstractJvmBasicCompletionTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
    }

    @TestMetadata("AfterPackageName.kt")
    public void testAfterPackageName() throws Exception {
        runTest("idea/idea-completion/testData/kdoc/AfterPackageName.kt");
    }

    public void testAllFilesPresentInKdoc() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/idea-completion/testData/kdoc"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
    }

    @TestMetadata("AutoPopupAfterAtInKDoc.kt")
    public void testAutoPopupAfterAtInKDoc() throws Exception {
        runTest("idea/idea-completion/testData/kdoc/AutoPopupAfterAtInKDoc.kt");
    }

    @TestMetadata("ExtensionsFQLink.kt")
    public void testExtensionsFQLink() throws Exception {
        runTest("idea/idea-completion/testData/kdoc/ExtensionsFQLink.kt");
    }

    @TestMetadata("ExtensionsForNestedClassFQLink.kt")
    public void testExtensionsForNestedClassFQLink() throws Exception {
        runTest("idea/idea-completion/testData/kdoc/ExtensionsForNestedClassFQLink.kt");
    }

    @TestMetadata("FQLink.kt")
    public void testFQLink() throws Exception {
        runTest("idea/idea-completion/testData/kdoc/FQLink.kt");
    }

    @TestMetadata("FQLinkInTag1.kt")
    public void testFQLinkInTag1() throws Exception {
        runTest("idea/idea-completion/testData/kdoc/FQLinkInTag1.kt");
    }

    @TestMetadata("FQLinkInTag2.kt")
    public void testFQLinkInTag2() throws Exception {
        runTest("idea/idea-completion/testData/kdoc/FQLinkInTag2.kt");
    }

    @TestMetadata("Link.kt")
    public void testLink() throws Exception {
        runTest("idea/idea-completion/testData/kdoc/Link.kt");
    }

    @TestMetadata("MemberEnumEntryFQLink.kt")
    public void testMemberEnumEntryFQLink() throws Exception {
        runTest("idea/idea-completion/testData/kdoc/MemberEnumEntryFQLink.kt");
    }

    @TestMetadata("MemberEnumEntryLink.kt")
    public void testMemberEnumEntryLink() throws Exception {
        runTest("idea/idea-completion/testData/kdoc/MemberEnumEntryLink.kt");
    }

    @TestMetadata("MemberLink.kt")
    public void testMemberLink() throws Exception {
        runTest("idea/idea-completion/testData/kdoc/MemberLink.kt");
    }

    @TestMetadata("NoAutoPopupAfterDigitInKDoc.kt")
    public void testNoAutoPopupAfterDigitInKDoc() throws Exception {
        runTest("idea/idea-completion/testData/kdoc/NoAutoPopupAfterDigitInKDoc.kt");
    }

    @TestMetadata("NoCompletionAfterFunName.kt")
    public void testNoCompletionAfterFunName() throws Exception {
        runTest("idea/idea-completion/testData/kdoc/NoCompletionAfterFunName.kt");
    }

    @TestMetadata("NoTopLevelForQualified.kt")
    public void testNoTopLevelForQualified() throws Exception {
        runTest("idea/idea-completion/testData/kdoc/NoTopLevelForQualified.kt");
    }

    @TestMetadata("NotTagName.kt")
    public void testNotTagName() throws Exception {
        runTest("idea/idea-completion/testData/kdoc/NotTagName.kt");
    }

    @TestMetadata("ParamTag.kt")
    public void testParamTag() throws Exception {
        runTest("idea/idea-completion/testData/kdoc/ParamTag.kt");
    }

    @TestMetadata("SkipExistingParamTag.kt")
    public void testSkipExistingParamTag() throws Exception {
        runTest("idea/idea-completion/testData/kdoc/SkipExistingParamTag.kt");
    }

    @TestMetadata("TagName.kt")
    public void testTagName() throws Exception {
        runTest("idea/idea-completion/testData/kdoc/TagName.kt");
    }

    @TestMetadata("TagNameAfterAt.kt")
    public void testTagNameAfterAt() throws Exception {
        runTest("idea/idea-completion/testData/kdoc/TagNameAfterAt.kt");
    }

    @TestMetadata("TagNameInClass.kt")
    public void testTagNameInClass() throws Exception {
        runTest("idea/idea-completion/testData/kdoc/TagNameInClass.kt");
    }

    @TestMetadata("TagNameInExtensionFunction.kt")
    public void testTagNameInExtensionFunction() throws Exception {
        runTest("idea/idea-completion/testData/kdoc/TagNameInExtensionFunction.kt");
    }

    @TestMetadata("TagNameMiddle.kt")
    public void testTagNameMiddle() throws Exception {
        runTest("idea/idea-completion/testData/kdoc/TagNameMiddle.kt");
    }

    @TestMetadata("TagNameStart.kt")
    public void testTagNameStart() throws Exception {
        runTest("idea/idea-completion/testData/kdoc/TagNameStart.kt");
    }
}
