package org.eclipse.xtext.ui.tests.editor.contentassist.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.eclipse.xtext.ui.tests.editor.contentassist.services.DomainModelTestLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDomainModelTestLanguageParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'datatype'", "';'", "'class'", "'{'", "'}'", "'extends'", "'attr'", "':'", "'ref'"
    };
    public static final int T__19=19;
    public static final int RULE_ID=5;
    public static final int RULE_STRING=4;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__20=20;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalDomainModelTestLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDomainModelTestLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDomainModelTestLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDomainModelTestLanguage.g"; }


     
     	private DomainModelTestLanguageGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(DomainModelTestLanguageGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleModel"
    // InternalDomainModelTestLanguage.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalDomainModelTestLanguage.g:61:1: ( ruleModel EOF )
            // InternalDomainModelTestLanguage.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalDomainModelTestLanguage.g:69:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDomainModelTestLanguage.g:73:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalDomainModelTestLanguage.g:74:1: ( ( rule__Model__Group__0 ) )
            {
            // InternalDomainModelTestLanguage.g:74:1: ( ( rule__Model__Group__0 ) )
            // InternalDomainModelTestLanguage.g:75:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalDomainModelTestLanguage.g:76:1: ( rule__Model__Group__0 )
            // InternalDomainModelTestLanguage.g:76:2: rule__Model__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleImport"
    // InternalDomainModelTestLanguage.g:88:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalDomainModelTestLanguage.g:89:1: ( ruleImport EOF )
            // InternalDomainModelTestLanguage.g:90:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalDomainModelTestLanguage.g:97:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDomainModelTestLanguage.g:101:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalDomainModelTestLanguage.g:102:1: ( ( rule__Import__Group__0 ) )
            {
            // InternalDomainModelTestLanguage.g:102:1: ( ( rule__Import__Group__0 ) )
            // InternalDomainModelTestLanguage.g:103:1: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // InternalDomainModelTestLanguage.g:104:1: ( rule__Import__Group__0 )
            // InternalDomainModelTestLanguage.g:104:2: rule__Import__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Import__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleType"
    // InternalDomainModelTestLanguage.g:116:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalDomainModelTestLanguage.g:117:1: ( ruleType EOF )
            // InternalDomainModelTestLanguage.g:118:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalDomainModelTestLanguage.g:125:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDomainModelTestLanguage.g:129:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalDomainModelTestLanguage.g:130:1: ( ( rule__Type__Alternatives ) )
            {
            // InternalDomainModelTestLanguage.g:130:1: ( ( rule__Type__Alternatives ) )
            // InternalDomainModelTestLanguage.g:131:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalDomainModelTestLanguage.g:132:1: ( rule__Type__Alternatives )
            // InternalDomainModelTestLanguage.g:132:2: rule__Type__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleDataType"
    // InternalDomainModelTestLanguage.g:144:1: entryRuleDataType : ruleDataType EOF ;
    public final void entryRuleDataType() throws RecognitionException {
        try {
            // InternalDomainModelTestLanguage.g:145:1: ( ruleDataType EOF )
            // InternalDomainModelTestLanguage.g:146:1: ruleDataType EOF
            {
             before(grammarAccess.getDataTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getDataTypeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // InternalDomainModelTestLanguage.g:153:1: ruleDataType : ( ( rule__DataType__Group__0 ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDomainModelTestLanguage.g:157:2: ( ( ( rule__DataType__Group__0 ) ) )
            // InternalDomainModelTestLanguage.g:158:1: ( ( rule__DataType__Group__0 ) )
            {
            // InternalDomainModelTestLanguage.g:158:1: ( ( rule__DataType__Group__0 ) )
            // InternalDomainModelTestLanguage.g:159:1: ( rule__DataType__Group__0 )
            {
             before(grammarAccess.getDataTypeAccess().getGroup()); 
            // InternalDomainModelTestLanguage.g:160:1: ( rule__DataType__Group__0 )
            // InternalDomainModelTestLanguage.g:160:2: rule__DataType__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DataType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleClass"
    // InternalDomainModelTestLanguage.g:172:1: entryRuleClass : ruleClass EOF ;
    public final void entryRuleClass() throws RecognitionException {
        try {
            // InternalDomainModelTestLanguage.g:173:1: ( ruleClass EOF )
            // InternalDomainModelTestLanguage.g:174:1: ruleClass EOF
            {
             before(grammarAccess.getClassRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleClass();

            state._fsp--;

             after(grammarAccess.getClassRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleClass"


    // $ANTLR start "ruleClass"
    // InternalDomainModelTestLanguage.g:181:1: ruleClass : ( ( rule__Class__Group__0 ) ) ;
    public final void ruleClass() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDomainModelTestLanguage.g:185:2: ( ( ( rule__Class__Group__0 ) ) )
            // InternalDomainModelTestLanguage.g:186:1: ( ( rule__Class__Group__0 ) )
            {
            // InternalDomainModelTestLanguage.g:186:1: ( ( rule__Class__Group__0 ) )
            // InternalDomainModelTestLanguage.g:187:1: ( rule__Class__Group__0 )
            {
             before(grammarAccess.getClassAccess().getGroup()); 
            // InternalDomainModelTestLanguage.g:188:1: ( rule__Class__Group__0 )
            // InternalDomainModelTestLanguage.g:188:2: rule__Class__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Class__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRuleProperty"
    // InternalDomainModelTestLanguage.g:200:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // InternalDomainModelTestLanguage.g:201:1: ( ruleProperty EOF )
            // InternalDomainModelTestLanguage.g:202:1: ruleProperty EOF
            {
             before(grammarAccess.getPropertyRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getPropertyRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // InternalDomainModelTestLanguage.g:209:1: ruleProperty : ( ( rule__Property__Alternatives ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDomainModelTestLanguage.g:213:2: ( ( ( rule__Property__Alternatives ) ) )
            // InternalDomainModelTestLanguage.g:214:1: ( ( rule__Property__Alternatives ) )
            {
            // InternalDomainModelTestLanguage.g:214:1: ( ( rule__Property__Alternatives ) )
            // InternalDomainModelTestLanguage.g:215:1: ( rule__Property__Alternatives )
            {
             before(grammarAccess.getPropertyAccess().getAlternatives()); 
            // InternalDomainModelTestLanguage.g:216:1: ( rule__Property__Alternatives )
            // InternalDomainModelTestLanguage.g:216:2: rule__Property__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Property__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleAttribute"
    // InternalDomainModelTestLanguage.g:228:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalDomainModelTestLanguage.g:229:1: ( ruleAttribute EOF )
            // InternalDomainModelTestLanguage.g:230:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalDomainModelTestLanguage.g:237:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDomainModelTestLanguage.g:241:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalDomainModelTestLanguage.g:242:1: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalDomainModelTestLanguage.g:242:1: ( ( rule__Attribute__Group__0 ) )
            // InternalDomainModelTestLanguage.g:243:1: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalDomainModelTestLanguage.g:244:1: ( rule__Attribute__Group__0 )
            // InternalDomainModelTestLanguage.g:244:2: rule__Attribute__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleReference"
    // InternalDomainModelTestLanguage.g:256:1: entryRuleReference : ruleReference EOF ;
    public final void entryRuleReference() throws RecognitionException {
        try {
            // InternalDomainModelTestLanguage.g:257:1: ( ruleReference EOF )
            // InternalDomainModelTestLanguage.g:258:1: ruleReference EOF
            {
             before(grammarAccess.getReferenceRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleReference();

            state._fsp--;

             after(grammarAccess.getReferenceRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // InternalDomainModelTestLanguage.g:265:1: ruleReference : ( ( rule__Reference__Group__0 ) ) ;
    public final void ruleReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDomainModelTestLanguage.g:269:2: ( ( ( rule__Reference__Group__0 ) ) )
            // InternalDomainModelTestLanguage.g:270:1: ( ( rule__Reference__Group__0 ) )
            {
            // InternalDomainModelTestLanguage.g:270:1: ( ( rule__Reference__Group__0 ) )
            // InternalDomainModelTestLanguage.g:271:1: ( rule__Reference__Group__0 )
            {
             before(grammarAccess.getReferenceAccess().getGroup()); 
            // InternalDomainModelTestLanguage.g:272:1: ( rule__Reference__Group__0 )
            // InternalDomainModelTestLanguage.g:272:2: rule__Reference__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Reference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReference"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalDomainModelTestLanguage.g:284:1: rule__Type__Alternatives : ( ( ruleDataType ) | ( ruleClass ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDomainModelTestLanguage.g:288:1: ( ( ruleDataType ) | ( ruleClass ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            else if ( (LA1_0==14) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalDomainModelTestLanguage.g:289:1: ( ruleDataType )
                    {
                    // InternalDomainModelTestLanguage.g:289:1: ( ruleDataType )
                    // InternalDomainModelTestLanguage.g:290:1: ruleDataType
                    {
                     before(grammarAccess.getTypeAccess().getDataTypeParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleDataType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getDataTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDomainModelTestLanguage.g:295:6: ( ruleClass )
                    {
                    // InternalDomainModelTestLanguage.g:295:6: ( ruleClass )
                    // InternalDomainModelTestLanguage.g:296:1: ruleClass
                    {
                     before(grammarAccess.getTypeAccess().getClassParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleClass();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getClassParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__Property__Alternatives"
    // InternalDomainModelTestLanguage.g:306:1: rule__Property__Alternatives : ( ( ruleAttribute ) | ( ruleReference ) );
    public final void rule__Property__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDomainModelTestLanguage.g:310:1: ( ( ruleAttribute ) | ( ruleReference ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==18) ) {
                alt2=1;
            }
            else if ( (LA2_0==20) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalDomainModelTestLanguage.g:311:1: ( ruleAttribute )
                    {
                    // InternalDomainModelTestLanguage.g:311:1: ( ruleAttribute )
                    // InternalDomainModelTestLanguage.g:312:1: ruleAttribute
                    {
                     before(grammarAccess.getPropertyAccess().getAttributeParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleAttribute();

                    state._fsp--;

                     after(grammarAccess.getPropertyAccess().getAttributeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDomainModelTestLanguage.g:317:6: ( ruleReference )
                    {
                    // InternalDomainModelTestLanguage.g:317:6: ( ruleReference )
                    // InternalDomainModelTestLanguage.g:318:1: ruleReference
                    {
                     before(grammarAccess.getPropertyAccess().getReferenceParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleReference();

                    state._fsp--;

                     after(grammarAccess.getPropertyAccess().getReferenceParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalDomainModelTestLanguage.g:330:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDomainModelTestLanguage.g:334:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalDomainModelTestLanguage.g:335:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalDomainModelTestLanguage.g:342:1: rule__Model__Group__0__Impl : ( ( rule__Model__ImportsAssignment_0 )* ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDomainModelTestLanguage.g:346:1: ( ( ( rule__Model__ImportsAssignment_0 )* ) )
            // InternalDomainModelTestLanguage.g:347:1: ( ( rule__Model__ImportsAssignment_0 )* )
            {
            // InternalDomainModelTestLanguage.g:347:1: ( ( rule__Model__ImportsAssignment_0 )* )
            // InternalDomainModelTestLanguage.g:348:1: ( rule__Model__ImportsAssignment_0 )*
            {
             before(grammarAccess.getModelAccess().getImportsAssignment_0()); 
            // InternalDomainModelTestLanguage.g:349:1: ( rule__Model__ImportsAssignment_0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==11) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDomainModelTestLanguage.g:349:2: rule__Model__ImportsAssignment_0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_4);
            	    rule__Model__ImportsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getImportsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalDomainModelTestLanguage.g:359:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDomainModelTestLanguage.g:363:1: ( rule__Model__Group__1__Impl )
            // InternalDomainModelTestLanguage.g:364:2: rule__Model__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Model__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalDomainModelTestLanguage.g:370:1: rule__Model__Group__1__Impl : ( ( rule__Model__ElementsAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDomainModelTestLanguage.g:374:1: ( ( ( rule__Model__ElementsAssignment_1 )* ) )
            // InternalDomainModelTestLanguage.g:375:1: ( ( rule__Model__ElementsAssignment_1 )* )
            {
            // InternalDomainModelTestLanguage.g:375:1: ( ( rule__Model__ElementsAssignment_1 )* )
            // InternalDomainModelTestLanguage.g:376:1: ( rule__Model__ElementsAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getElementsAssignment_1()); 
            // InternalDomainModelTestLanguage.g:377:1: ( rule__Model__ElementsAssignment_1 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==12||LA4_0==14) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDomainModelTestLanguage.g:377:2: rule__Model__ElementsAssignment_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    rule__Model__ElementsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getElementsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // InternalDomainModelTestLanguage.g:391:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDomainModelTestLanguage.g:395:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalDomainModelTestLanguage.g:396:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Import__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // InternalDomainModelTestLanguage.g:403:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDomainModelTestLanguage.g:407:1: ( ( 'import' ) )
            // InternalDomainModelTestLanguage.g:408:1: ( 'import' )
            {
            // InternalDomainModelTestLanguage.g:408:1: ( 'import' )
            // InternalDomainModelTestLanguage.g:409:1: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,11,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getImportAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // InternalDomainModelTestLanguage.g:422:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDomainModelTestLanguage.g:426:1: ( rule__Import__Group__1__Impl )
            // InternalDomainModelTestLanguage.g:427:2: rule__Import__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Import__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // InternalDomainModelTestLanguage.g:433:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportURIAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDomainModelTestLanguage.g:437:1: ( ( ( rule__Import__ImportURIAssignment_1 ) ) )
            // InternalDomainModelTestLanguage.g:438:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            {
            // InternalDomainModelTestLanguage.g:438:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            // InternalDomainModelTestLanguage.g:439:1: ( rule__Import__ImportURIAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportURIAssignment_1()); 
            // InternalDomainModelTestLanguage.g:440:1: ( rule__Import__ImportURIAssignment_1 )
            // InternalDomainModelTestLanguage.g:440:2: rule__Import__ImportURIAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Import__ImportURIAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getImportURIAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__DataType__Group__0"
    // InternalDomainModelTestLanguage.g:454:1: rule__DataType__Group__0 : rule__DataType__Group__0__Impl rule__DataType__Group__1 ;
    public final void rule__DataType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDomainModelTestLanguage.g:458:1: ( rule__DataType__Group__0__Impl rule__DataType__Group__1 )
            // InternalDomainModelTestLanguage.g:459:2: rule__DataType__Group__0__Impl rule__DataType__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__DataType__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DataType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__0"


    // $ANTLR start "rule__DataType__Group__0__Impl"
    // InternalDomainModelTestLanguage.g:466:1: rule__DataType__Group__0__Impl : ( 'datatype' ) ;
    public final void rule__DataType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDomainModelTestLanguage.g:470:1: ( ( 'datatype' ) )
            // InternalDomainModelTestLanguage.g:471:1: ( 'datatype' )
            {
            // InternalDomainModelTestLanguage.g:471:1: ( 'datatype' )
            // InternalDomainModelTestLanguage.g:472:1: 'datatype'
            {
             before(grammarAccess.getDataTypeAccess().getDatatypeKeyword_0()); 
            match(input,12,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getDataTypeAccess().getDatatypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__0__Impl"


    // $ANTLR start "rule__DataType__Group__1"
    // InternalDomainModelTestLanguage.g:485:1: rule__DataType__Group__1 : rule__DataType__Group__1__Impl rule__DataType__Group__2 ;
    public final void rule__DataType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDomainModelTestLanguage.g:489:1: ( rule__DataType__Group__1__Impl rule__DataType__Group__2 )
            // InternalDomainModelTestLanguage.g:490:2: rule__DataType__Group__1__Impl rule__DataType__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__DataType__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DataType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__1"


    // $ANTLR start "rule__DataType__Group__1__Impl"
    // InternalDomainModelTestLanguage.g:497:1: rule__DataType__Group__1__Impl : ( ( rule__DataType__NameAssignment_1 ) ) ;
    public final void rule__DataType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDomainModelTestLanguage.g:501:1: ( ( ( rule__DataType__NameAssignment_1 ) ) )
            // InternalDomainModelTestLanguage.g:502:1: ( ( rule__DataType__NameAssignment_1 ) )
            {
            // InternalDomainModelTestLanguage.g:502:1: ( ( rule__DataType__NameAssignment_1 ) )
            // InternalDomainModelTestLanguage.g:503:1: ( rule__DataType__NameAssignment_1 )
            {
             before(grammarAccess.getDataTypeAccess().getNameAssignment_1()); 
            // InternalDomainModelTestLanguage.g:504:1: ( rule__DataType__NameAssignment_1 )
            // InternalDomainModelTestLanguage.g:504:2: rule__DataType__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DataType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__1__Impl"


    // $ANTLR start "rule__DataType__Group__2"
    // InternalDomainModelTestLanguage.g:514:1: rule__DataType__Group__2 : rule__DataType__Group__2__Impl ;
    public final void rule__DataType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDomainModelTestLanguage.g:518:1: ( rule__DataType__Group__2__Impl )
            // InternalDomainModelTestLanguage.g:519:2: rule__DataType__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DataType__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__2"


    // $ANTLR start "rule__DataType__Group__2__Impl"
    // InternalDomainModelTestLanguage.g:525:1: rule__DataType__Group__2__Impl : ( ( ';' )? ) ;
    public final void rule__DataType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDomainModelTestLanguage.g:529:1: ( ( ( ';' )? ) )
            // InternalDomainModelTestLanguage.g:530:1: ( ( ';' )? )
            {
            // InternalDomainModelTestLanguage.g:530:1: ( ( ';' )? )
            // InternalDomainModelTestLanguage.g:531:1: ( ';' )?
            {
             before(grammarAccess.getDataTypeAccess().getSemicolonKeyword_2()); 
            // InternalDomainModelTestLanguage.g:532:1: ( ';' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalDomainModelTestLanguage.g:533:2: ';'
                    {
                    match(input,13,FollowSets000.FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getDataTypeAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__2__Impl"


    // $ANTLR start "rule__Class__Group__0"
    // InternalDomainModelTestLanguage.g:550:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDomainModelTestLanguage.g:554:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // InternalDomainModelTestLanguage.g:555:2: rule__Class__Group__0__Impl rule__Class__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__Class__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Class__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__0"


    // $ANTLR start "rule__Class__Group__0__Impl"
    // InternalDomainModelTestLanguage.g:562:1: rule__Class__Group__0__Impl : ( 'class' ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDomainModelTestLanguage.g:566:1: ( ( 'class' ) )
            // InternalDomainModelTestLanguage.g:567:1: ( 'class' )
            {
            // InternalDomainModelTestLanguage.g:567:1: ( 'class' )
            // InternalDomainModelTestLanguage.g:568:1: 'class'
            {
             before(grammarAccess.getClassAccess().getClassKeyword_0()); 
            match(input,14,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getClassAccess().getClassKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__0__Impl"


    // $ANTLR start "rule__Class__Group__1"
    // InternalDomainModelTestLanguage.g:581:1: rule__Class__Group__1 : rule__Class__Group__1__Impl rule__Class__Group__2 ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDomainModelTestLanguage.g:585:1: ( rule__Class__Group__1__Impl rule__Class__Group__2 )
            // InternalDomainModelTestLanguage.g:586:2: rule__Class__Group__1__Impl rule__Class__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__Class__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Class__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__1"


    // $ANTLR start "rule__Class__Group__1__Impl"
    // InternalDomainModelTestLanguage.g:593:1: rule__Class__Group__1__Impl : ( ( rule__Class__NameAssignment_1 ) ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDomainModelTestLanguage.g:597:1: ( ( ( rule__Class__NameAssignment_1 ) ) )
            // InternalDomainModelTestLanguage.g:598:1: ( ( rule__Class__NameAssignment_1 ) )
            {
            // InternalDomainModelTestLanguage.g:598:1: ( ( rule__Class__NameAssignment_1 ) )
            // InternalDomainModelTestLanguage.g:599:1: ( rule__Class__NameAssignment_1 )
            {
             before(grammarAccess.getClassAccess().getNameAssignment_1()); 
            // InternalDomainModelTestLanguage.g:600:1: ( rule__Class__NameAssignment_1 )
            // InternalDomainModelTestLanguage.g:600:2: rule__Class__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Class__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__1__Impl"


    // $ANTLR start "rule__Class__Group__2"
    // InternalDomainModelTestLanguage.g:610:1: rule__Class__Group__2 : rule__Class__Group__2__Impl rule__Class__Group__3 ;
    public final void rule__Class__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDomainModelTestLanguage.g:614:1: ( rule__Class__Group__2__Impl rule__Class__Group__3 )
            // InternalDomainModelTestLanguage.g:615:2: rule__Class__Group__2__Impl rule__Class__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__Class__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Class__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__2"


    // $ANTLR start "rule__Class__Group__2__Impl"
    // InternalDomainModelTestLanguage.g:622:1: rule__Class__Group__2__Impl : ( ( rule__Class__Group_2__0 )? ) ;
    public final void rule__Class__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDomainModelTestLanguage.g:626:1: ( ( ( rule__Class__Group_2__0 )? ) )
            // InternalDomainModelTestLanguage.g:627:1: ( ( rule__Class__Group_2__0 )? )
            {
            // InternalDomainModelTestLanguage.g:627:1: ( ( rule__Class__Group_2__0 )? )
            // InternalDomainModelTestLanguage.g:628:1: ( rule__Class__Group_2__0 )?
            {
             before(grammarAccess.getClassAccess().getGroup_2()); 
            // InternalDomainModelTestLanguage.g:629:1: ( rule__Class__Group_2__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDomainModelTestLanguage.g:629:2: rule__Class__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Class__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__2__Impl"


    // $ANTLR start "rule__Class__Group__3"
    // InternalDomainModelTestLanguage.g:639:1: rule__Class__Group__3 : rule__Class__Group__3__Impl rule__Class__Group__4 ;
    public final void rule__Class__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDomainModelTestLanguage.g:643:1: ( rule__Class__Group__3__Impl rule__Class__Group__4 )
            // InternalDomainModelTestLanguage.g:644:2: rule__Class__Group__3__Impl rule__Class__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__Class__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Class__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__3"


    // $ANTLR start "rule__Class__Group__3__Impl"
    // InternalDomainModelTestLanguage.g:651:1: rule__Class__Group__3__Impl : ( '{' ) ;
    public final void rule__Class__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDomainModelTestLanguage.g:655:1: ( ( '{' ) )
            // InternalDomainModelTestLanguage.g:656:1: ( '{' )
            {
            // InternalDomainModelTestLanguage.g:656:1: ( '{' )
            // InternalDomainModelTestLanguage.g:657:1: '{'
            {
             before(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,15,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__3__Impl"


    // $ANTLR start "rule__Class__Group__4"
    // InternalDomainModelTestLanguage.g:670:1: rule__Class__Group__4 : rule__Class__Group__4__Impl rule__Class__Group__5 ;
    public final void rule__Class__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDomainModelTestLanguage.g:674:1: ( rule__Class__Group__4__Impl rule__Class__Group__5 )
            // InternalDomainModelTestLanguage.g:675:2: rule__Class__Group__4__Impl rule__Class__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__Class__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Class__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__4"


    // $ANTLR start "rule__Class__Group__4__Impl"
    // InternalDomainModelTestLanguage.g:682:1: rule__Class__Group__4__Impl : ( ( rule__Class__PropertiesAssignment_4 )* ) ;
    public final void rule__Class__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDomainModelTestLanguage.g:686:1: ( ( ( rule__Class__PropertiesAssignment_4 )* ) )
            // InternalDomainModelTestLanguage.g:687:1: ( ( rule__Class__PropertiesAssignment_4 )* )
            {
            // InternalDomainModelTestLanguage.g:687:1: ( ( rule__Class__PropertiesAssignment_4 )* )
            // InternalDomainModelTestLanguage.g:688:1: ( rule__Class__PropertiesAssignment_4 )*
            {
             before(grammarAccess.getClassAccess().getPropertiesAssignment_4()); 
            // InternalDomainModelTestLanguage.g:689:1: ( rule__Class__PropertiesAssignment_4 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==18||LA7_0==20) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalDomainModelTestLanguage.g:689:2: rule__Class__PropertiesAssignment_4
            	    {
            	    pushFollow(FollowSets000.FOLLOW_11);
            	    rule__Class__PropertiesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getClassAccess().getPropertiesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__4__Impl"


    // $ANTLR start "rule__Class__Group__5"
    // InternalDomainModelTestLanguage.g:699:1: rule__Class__Group__5 : rule__Class__Group__5__Impl rule__Class__Group__6 ;
    public final void rule__Class__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDomainModelTestLanguage.g:703:1: ( rule__Class__Group__5__Impl rule__Class__Group__6 )
            // InternalDomainModelTestLanguage.g:704:2: rule__Class__Group__5__Impl rule__Class__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__Class__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Class__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__5"


    // $ANTLR start "rule__Class__Group__5__Impl"
    // InternalDomainModelTestLanguage.g:711:1: rule__Class__Group__5__Impl : ( ( rule__Class__SubClassesAssignment_5 )* ) ;
    public final void rule__Class__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDomainModelTestLanguage.g:715:1: ( ( ( rule__Class__SubClassesAssignment_5 )* ) )
            // InternalDomainModelTestLanguage.g:716:1: ( ( rule__Class__SubClassesAssignment_5 )* )
            {
            // InternalDomainModelTestLanguage.g:716:1: ( ( rule__Class__SubClassesAssignment_5 )* )
            // InternalDomainModelTestLanguage.g:717:1: ( rule__Class__SubClassesAssignment_5 )*
            {
             before(grammarAccess.getClassAccess().getSubClassesAssignment_5()); 
            // InternalDomainModelTestLanguage.g:718:1: ( rule__Class__SubClassesAssignment_5 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==14) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDomainModelTestLanguage.g:718:2: rule__Class__SubClassesAssignment_5
            	    {
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    rule__Class__SubClassesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getClassAccess().getSubClassesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__5__Impl"


    // $ANTLR start "rule__Class__Group__6"
    // InternalDomainModelTestLanguage.g:728:1: rule__Class__Group__6 : rule__Class__Group__6__Impl ;
    public final void rule__Class__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDomainModelTestLanguage.g:732:1: ( rule__Class__Group__6__Impl )
            // InternalDomainModelTestLanguage.g:733:2: rule__Class__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Class__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__6"


    // $ANTLR start "rule__Class__Group__6__Impl"
    // InternalDomainModelTestLanguage.g:739:1: rule__Class__Group__6__Impl : ( '}' ) ;
    public final void rule__Class__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDomainModelTestLanguage.g:743:1: ( ( '}' ) )
            // InternalDomainModelTestLanguage.g:744:1: ( '}' )
            {
            // InternalDomainModelTestLanguage.g:744:1: ( '}' )
            // InternalDomainModelTestLanguage.g:745:1: '}'
            {
             before(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_6()); 
            match(input,16,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__6__Impl"


    // $ANTLR start "rule__Class__Group_2__0"
    // InternalDomainModelTestLanguage.g:772:1: rule__Class__Group_2__0 : rule__Class__Group_2__0__Impl rule__Class__Group_2__1 ;
    public final void rule__Class__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDomainModelTestLanguage.g:776:1: ( rule__Class__Group_2__0__Impl rule__Class__Group_2__1 )
            // InternalDomainModelTestLanguage.g:777:2: rule__Class__Group_2__0__Impl rule__Class__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__Class__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Class__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_2__0"


    // $ANTLR start "rule__Class__Group_2__0__Impl"
    // InternalDomainModelTestLanguage.g:784:1: rule__Class__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__Class__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDomainModelTestLanguage.g:788:1: ( ( 'extends' ) )
            // InternalDomainModelTestLanguage.g:789:1: ( 'extends' )
            {
            // InternalDomainModelTestLanguage.g:789:1: ( 'extends' )
            // InternalDomainModelTestLanguage.g:790:1: 'extends'
            {
             before(grammarAccess.getClassAccess().getExtendsKeyword_2_0()); 
            match(input,17,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getClassAccess().getExtendsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_2__0__Impl"


    // $ANTLR start "rule__Class__Group_2__1"
    // InternalDomainModelTestLanguage.g:803:1: rule__Class__Group_2__1 : rule__Class__Group_2__1__Impl ;
    public final void rule__Class__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDomainModelTestLanguage.g:807:1: ( rule__Class__Group_2__1__Impl )
            // InternalDomainModelTestLanguage.g:808:2: rule__Class__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Class__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_2__1"


    // $ANTLR start "rule__Class__Group_2__1__Impl"
    // InternalDomainModelTestLanguage.g:814:1: rule__Class__Group_2__1__Impl : ( ( rule__Class__SuperClassAssignment_2_1 ) ) ;
    public final void rule__Class__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDomainModelTestLanguage.g:818:1: ( ( ( rule__Class__SuperClassAssignment_2_1 ) ) )
            // InternalDomainModelTestLanguage.g:819:1: ( ( rule__Class__SuperClassAssignment_2_1 ) )
            {
            // InternalDomainModelTestLanguage.g:819:1: ( ( rule__Class__SuperClassAssignment_2_1 ) )
            // InternalDomainModelTestLanguage.g:820:1: ( rule__Class__SuperClassAssignment_2_1 )
            {
             before(grammarAccess.getClassAccess().getSuperClassAssignment_2_1()); 
            // InternalDomainModelTestLanguage.g:821:1: ( rule__Class__SuperClassAssignment_2_1 )
            // InternalDomainModelTestLanguage.g:821:2: rule__Class__SuperClassAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Class__SuperClassAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getSuperClassAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_2__1__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalDomainModelTestLanguage.g:835:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDomainModelTestLanguage.g:839:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalDomainModelTestLanguage.g:840:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Attribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // InternalDomainModelTestLanguage.g:847:1: rule__Attribute__Group__0__Impl : ( 'attr' ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDomainModelTestLanguage.g:851:1: ( ( 'attr' ) )
            // InternalDomainModelTestLanguage.g:852:1: ( 'attr' )
            {
            // InternalDomainModelTestLanguage.g:852:1: ( 'attr' )
            // InternalDomainModelTestLanguage.g:853:1: 'attr'
            {
             before(grammarAccess.getAttributeAccess().getAttrKeyword_0()); 
            match(input,18,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getAttrKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // InternalDomainModelTestLanguage.g:866:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDomainModelTestLanguage.g:870:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalDomainModelTestLanguage.g:871:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Attribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // InternalDomainModelTestLanguage.g:878:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDomainModelTestLanguage.g:882:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // InternalDomainModelTestLanguage.g:883:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // InternalDomainModelTestLanguage.g:883:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // InternalDomainModelTestLanguage.g:884:1: ( rule__Attribute__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            // InternalDomainModelTestLanguage.g:885:1: ( rule__Attribute__NameAssignment_1 )
            // InternalDomainModelTestLanguage.g:885:2: rule__Attribute__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Attribute__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // InternalDomainModelTestLanguage.g:895:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDomainModelTestLanguage.g:899:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalDomainModelTestLanguage.g:900:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__Attribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Attribute__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // InternalDomainModelTestLanguage.g:907:1: rule__Attribute__Group__2__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDomainModelTestLanguage.g:911:1: ( ( ':' ) )
            // InternalDomainModelTestLanguage.g:912:1: ( ':' )
            {
            // InternalDomainModelTestLanguage.g:912:1: ( ':' )
            // InternalDomainModelTestLanguage.g:913:1: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_2()); 
            match(input,19,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__Attribute__Group__3"
    // InternalDomainModelTestLanguage.g:926:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl rule__Attribute__Group__4 ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDomainModelTestLanguage.g:930:1: ( rule__Attribute__Group__3__Impl rule__Attribute__Group__4 )
            // InternalDomainModelTestLanguage.g:931:2: rule__Attribute__Group__3__Impl rule__Attribute__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__Attribute__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Attribute__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__3"


    // $ANTLR start "rule__Attribute__Group__3__Impl"
    // InternalDomainModelTestLanguage.g:938:1: rule__Attribute__Group__3__Impl : ( ( rule__Attribute__TypeAssignment_3 ) ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDomainModelTestLanguage.g:942:1: ( ( ( rule__Attribute__TypeAssignment_3 ) ) )
            // InternalDomainModelTestLanguage.g:943:1: ( ( rule__Attribute__TypeAssignment_3 ) )
            {
            // InternalDomainModelTestLanguage.g:943:1: ( ( rule__Attribute__TypeAssignment_3 ) )
            // InternalDomainModelTestLanguage.g:944:1: ( rule__Attribute__TypeAssignment_3 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_3()); 
            // InternalDomainModelTestLanguage.g:945:1: ( rule__Attribute__TypeAssignment_3 )
            // InternalDomainModelTestLanguage.g:945:2: rule__Attribute__TypeAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Attribute__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__3__Impl"


    // $ANTLR start "rule__Attribute__Group__4"
    // InternalDomainModelTestLanguage.g:955:1: rule__Attribute__Group__4 : rule__Attribute__Group__4__Impl ;
    public final void rule__Attribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDomainModelTestLanguage.g:959:1: ( rule__Attribute__Group__4__Impl )
            // InternalDomainModelTestLanguage.g:960:2: rule__Attribute__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Attribute__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__4"


    // $ANTLR start "rule__Attribute__Group__4__Impl"
    // InternalDomainModelTestLanguage.g:966:1: rule__Attribute__Group__4__Impl : ( ( ';' )? ) ;
    public final void rule__Attribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDomainModelTestLanguage.g:970:1: ( ( ( ';' )? ) )
            // InternalDomainModelTestLanguage.g:971:1: ( ( ';' )? )
            {
            // InternalDomainModelTestLanguage.g:971:1: ( ( ';' )? )
            // InternalDomainModelTestLanguage.g:972:1: ( ';' )?
            {
             before(grammarAccess.getAttributeAccess().getSemicolonKeyword_4()); 
            // InternalDomainModelTestLanguage.g:973:1: ( ';' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==13) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDomainModelTestLanguage.g:974:2: ';'
                    {
                    match(input,13,FollowSets000.FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__4__Impl"


    // $ANTLR start "rule__Reference__Group__0"
    // InternalDomainModelTestLanguage.g:995:1: rule__Reference__Group__0 : rule__Reference__Group__0__Impl rule__Reference__Group__1 ;
    public final void rule__Reference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDomainModelTestLanguage.g:999:1: ( rule__Reference__Group__0__Impl rule__Reference__Group__1 )
            // InternalDomainModelTestLanguage.g:1000:2: rule__Reference__Group__0__Impl rule__Reference__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__Reference__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Reference__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__0"


    // $ANTLR start "rule__Reference__Group__0__Impl"
    // InternalDomainModelTestLanguage.g:1007:1: rule__Reference__Group__0__Impl : ( 'ref' ) ;
    public final void rule__Reference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDomainModelTestLanguage.g:1011:1: ( ( 'ref' ) )
            // InternalDomainModelTestLanguage.g:1012:1: ( 'ref' )
            {
            // InternalDomainModelTestLanguage.g:1012:1: ( 'ref' )
            // InternalDomainModelTestLanguage.g:1013:1: 'ref'
            {
             before(grammarAccess.getReferenceAccess().getRefKeyword_0()); 
            match(input,20,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getRefKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__0__Impl"


    // $ANTLR start "rule__Reference__Group__1"
    // InternalDomainModelTestLanguage.g:1026:1: rule__Reference__Group__1 : rule__Reference__Group__1__Impl rule__Reference__Group__2 ;
    public final void rule__Reference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDomainModelTestLanguage.g:1030:1: ( rule__Reference__Group__1__Impl rule__Reference__Group__2 )
            // InternalDomainModelTestLanguage.g:1031:2: rule__Reference__Group__1__Impl rule__Reference__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__Reference__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Reference__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__1"


    // $ANTLR start "rule__Reference__Group__1__Impl"
    // InternalDomainModelTestLanguage.g:1038:1: rule__Reference__Group__1__Impl : ( ( rule__Reference__NameAssignment_1 ) ) ;
    public final void rule__Reference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDomainModelTestLanguage.g:1042:1: ( ( ( rule__Reference__NameAssignment_1 ) ) )
            // InternalDomainModelTestLanguage.g:1043:1: ( ( rule__Reference__NameAssignment_1 ) )
            {
            // InternalDomainModelTestLanguage.g:1043:1: ( ( rule__Reference__NameAssignment_1 ) )
            // InternalDomainModelTestLanguage.g:1044:1: ( rule__Reference__NameAssignment_1 )
            {
             before(grammarAccess.getReferenceAccess().getNameAssignment_1()); 
            // InternalDomainModelTestLanguage.g:1045:1: ( rule__Reference__NameAssignment_1 )
            // InternalDomainModelTestLanguage.g:1045:2: rule__Reference__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Reference__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__1__Impl"


    // $ANTLR start "rule__Reference__Group__2"
    // InternalDomainModelTestLanguage.g:1055:1: rule__Reference__Group__2 : rule__Reference__Group__2__Impl rule__Reference__Group__3 ;
    public final void rule__Reference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDomainModelTestLanguage.g:1059:1: ( rule__Reference__Group__2__Impl rule__Reference__Group__3 )
            // InternalDomainModelTestLanguage.g:1060:2: rule__Reference__Group__2__Impl rule__Reference__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__Reference__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Reference__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__2"


    // $ANTLR start "rule__Reference__Group__2__Impl"
    // InternalDomainModelTestLanguage.g:1067:1: rule__Reference__Group__2__Impl : ( ':' ) ;
    public final void rule__Reference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDomainModelTestLanguage.g:1071:1: ( ( ':' ) )
            // InternalDomainModelTestLanguage.g:1072:1: ( ':' )
            {
            // InternalDomainModelTestLanguage.g:1072:1: ( ':' )
            // InternalDomainModelTestLanguage.g:1073:1: ':'
            {
             before(grammarAccess.getReferenceAccess().getColonKeyword_2()); 
            match(input,19,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__2__Impl"


    // $ANTLR start "rule__Reference__Group__3"
    // InternalDomainModelTestLanguage.g:1086:1: rule__Reference__Group__3 : rule__Reference__Group__3__Impl rule__Reference__Group__4 ;
    public final void rule__Reference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDomainModelTestLanguage.g:1090:1: ( rule__Reference__Group__3__Impl rule__Reference__Group__4 )
            // InternalDomainModelTestLanguage.g:1091:2: rule__Reference__Group__3__Impl rule__Reference__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__Reference__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Reference__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__3"


    // $ANTLR start "rule__Reference__Group__3__Impl"
    // InternalDomainModelTestLanguage.g:1098:1: rule__Reference__Group__3__Impl : ( ( rule__Reference__TypeAssignment_3 ) ) ;
    public final void rule__Reference__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDomainModelTestLanguage.g:1102:1: ( ( ( rule__Reference__TypeAssignment_3 ) ) )
            // InternalDomainModelTestLanguage.g:1103:1: ( ( rule__Reference__TypeAssignment_3 ) )
            {
            // InternalDomainModelTestLanguage.g:1103:1: ( ( rule__Reference__TypeAssignment_3 ) )
            // InternalDomainModelTestLanguage.g:1104:1: ( rule__Reference__TypeAssignment_3 )
            {
             before(grammarAccess.getReferenceAccess().getTypeAssignment_3()); 
            // InternalDomainModelTestLanguage.g:1105:1: ( rule__Reference__TypeAssignment_3 )
            // InternalDomainModelTestLanguage.g:1105:2: rule__Reference__TypeAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Reference__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__3__Impl"


    // $ANTLR start "rule__Reference__Group__4"
    // InternalDomainModelTestLanguage.g:1115:1: rule__Reference__Group__4 : rule__Reference__Group__4__Impl ;
    public final void rule__Reference__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDomainModelTestLanguage.g:1119:1: ( rule__Reference__Group__4__Impl )
            // InternalDomainModelTestLanguage.g:1120:2: rule__Reference__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Reference__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__4"


    // $ANTLR start "rule__Reference__Group__4__Impl"
    // InternalDomainModelTestLanguage.g:1126:1: rule__Reference__Group__4__Impl : ( ( ';' )? ) ;
    public final void rule__Reference__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDomainModelTestLanguage.g:1130:1: ( ( ( ';' )? ) )
            // InternalDomainModelTestLanguage.g:1131:1: ( ( ';' )? )
            {
            // InternalDomainModelTestLanguage.g:1131:1: ( ( ';' )? )
            // InternalDomainModelTestLanguage.g:1132:1: ( ';' )?
            {
             before(grammarAccess.getReferenceAccess().getSemicolonKeyword_4()); 
            // InternalDomainModelTestLanguage.g:1133:1: ( ';' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==13) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalDomainModelTestLanguage.g:1134:2: ';'
                    {
                    match(input,13,FollowSets000.FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getReferenceAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__4__Impl"


    // $ANTLR start "rule__Model__ImportsAssignment_0"
    // InternalDomainModelTestLanguage.g:1156:1: rule__Model__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__Model__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDomainModelTestLanguage.g:1160:1: ( ( ruleImport ) )
            // InternalDomainModelTestLanguage.g:1161:1: ( ruleImport )
            {
            // InternalDomainModelTestLanguage.g:1161:1: ( ruleImport )
            // InternalDomainModelTestLanguage.g:1162:1: ruleImport
            {
             before(grammarAccess.getModelAccess().getImportsImportParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getModelAccess().getImportsImportParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ImportsAssignment_0"


    // $ANTLR start "rule__Model__ElementsAssignment_1"
    // InternalDomainModelTestLanguage.g:1171:1: rule__Model__ElementsAssignment_1 : ( ruleType ) ;
    public final void rule__Model__ElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDomainModelTestLanguage.g:1175:1: ( ( ruleType ) )
            // InternalDomainModelTestLanguage.g:1176:1: ( ruleType )
            {
            // InternalDomainModelTestLanguage.g:1176:1: ( ruleType )
            // InternalDomainModelTestLanguage.g:1177:1: ruleType
            {
             before(grammarAccess.getModelAccess().getElementsTypeParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getModelAccess().getElementsTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ElementsAssignment_1"


    // $ANTLR start "rule__Import__ImportURIAssignment_1"
    // InternalDomainModelTestLanguage.g:1186:1: rule__Import__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Import__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDomainModelTestLanguage.g:1190:1: ( ( RULE_STRING ) )
            // InternalDomainModelTestLanguage.g:1191:1: ( RULE_STRING )
            {
            // InternalDomainModelTestLanguage.g:1191:1: ( RULE_STRING )
            // InternalDomainModelTestLanguage.g:1192:1: RULE_STRING
            {
             before(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__ImportURIAssignment_1"


    // $ANTLR start "rule__DataType__NameAssignment_1"
    // InternalDomainModelTestLanguage.g:1201:1: rule__DataType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DataType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDomainModelTestLanguage.g:1205:1: ( ( RULE_ID ) )
            // InternalDomainModelTestLanguage.g:1206:1: ( RULE_ID )
            {
            // InternalDomainModelTestLanguage.g:1206:1: ( RULE_ID )
            // InternalDomainModelTestLanguage.g:1207:1: RULE_ID
            {
             before(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__NameAssignment_1"


    // $ANTLR start "rule__Class__NameAssignment_1"
    // InternalDomainModelTestLanguage.g:1216:1: rule__Class__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Class__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDomainModelTestLanguage.g:1220:1: ( ( RULE_ID ) )
            // InternalDomainModelTestLanguage.g:1221:1: ( RULE_ID )
            {
            // InternalDomainModelTestLanguage.g:1221:1: ( RULE_ID )
            // InternalDomainModelTestLanguage.g:1222:1: RULE_ID
            {
             before(grammarAccess.getClassAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getClassAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__NameAssignment_1"


    // $ANTLR start "rule__Class__SuperClassAssignment_2_1"
    // InternalDomainModelTestLanguage.g:1231:1: rule__Class__SuperClassAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Class__SuperClassAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDomainModelTestLanguage.g:1235:1: ( ( ( RULE_ID ) ) )
            // InternalDomainModelTestLanguage.g:1236:1: ( ( RULE_ID ) )
            {
            // InternalDomainModelTestLanguage.g:1236:1: ( ( RULE_ID ) )
            // InternalDomainModelTestLanguage.g:1237:1: ( RULE_ID )
            {
             before(grammarAccess.getClassAccess().getSuperClassClassCrossReference_2_1_0()); 
            // InternalDomainModelTestLanguage.g:1238:1: ( RULE_ID )
            // InternalDomainModelTestLanguage.g:1239:1: RULE_ID
            {
             before(grammarAccess.getClassAccess().getSuperClassClassIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getClassAccess().getSuperClassClassIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getClassAccess().getSuperClassClassCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__SuperClassAssignment_2_1"


    // $ANTLR start "rule__Class__PropertiesAssignment_4"
    // InternalDomainModelTestLanguage.g:1250:1: rule__Class__PropertiesAssignment_4 : ( ruleProperty ) ;
    public final void rule__Class__PropertiesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDomainModelTestLanguage.g:1254:1: ( ( ruleProperty ) )
            // InternalDomainModelTestLanguage.g:1255:1: ( ruleProperty )
            {
            // InternalDomainModelTestLanguage.g:1255:1: ( ruleProperty )
            // InternalDomainModelTestLanguage.g:1256:1: ruleProperty
            {
             before(grammarAccess.getClassAccess().getPropertiesPropertyParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getClassAccess().getPropertiesPropertyParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__PropertiesAssignment_4"


    // $ANTLR start "rule__Class__SubClassesAssignment_5"
    // InternalDomainModelTestLanguage.g:1265:1: rule__Class__SubClassesAssignment_5 : ( ruleClass ) ;
    public final void rule__Class__SubClassesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDomainModelTestLanguage.g:1269:1: ( ( ruleClass ) )
            // InternalDomainModelTestLanguage.g:1270:1: ( ruleClass )
            {
            // InternalDomainModelTestLanguage.g:1270:1: ( ruleClass )
            // InternalDomainModelTestLanguage.g:1271:1: ruleClass
            {
             before(grammarAccess.getClassAccess().getSubClassesClassParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleClass();

            state._fsp--;

             after(grammarAccess.getClassAccess().getSubClassesClassParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__SubClassesAssignment_5"


    // $ANTLR start "rule__Attribute__NameAssignment_1"
    // InternalDomainModelTestLanguage.g:1280:1: rule__Attribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDomainModelTestLanguage.g:1284:1: ( ( RULE_ID ) )
            // InternalDomainModelTestLanguage.g:1285:1: ( RULE_ID )
            {
            // InternalDomainModelTestLanguage.g:1285:1: ( RULE_ID )
            // InternalDomainModelTestLanguage.g:1286:1: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__NameAssignment_1"


    // $ANTLR start "rule__Attribute__TypeAssignment_3"
    // InternalDomainModelTestLanguage.g:1295:1: rule__Attribute__TypeAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Attribute__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDomainModelTestLanguage.g:1299:1: ( ( ( RULE_ID ) ) )
            // InternalDomainModelTestLanguage.g:1300:1: ( ( RULE_ID ) )
            {
            // InternalDomainModelTestLanguage.g:1300:1: ( ( RULE_ID ) )
            // InternalDomainModelTestLanguage.g:1301:1: ( RULE_ID )
            {
             before(grammarAccess.getAttributeAccess().getTypeDataTypeCrossReference_3_0()); 
            // InternalDomainModelTestLanguage.g:1302:1: ( RULE_ID )
            // InternalDomainModelTestLanguage.g:1303:1: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getTypeDataTypeIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getTypeDataTypeIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getAttributeAccess().getTypeDataTypeCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__TypeAssignment_3"


    // $ANTLR start "rule__Reference__NameAssignment_1"
    // InternalDomainModelTestLanguage.g:1314:1: rule__Reference__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Reference__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDomainModelTestLanguage.g:1318:1: ( ( RULE_ID ) )
            // InternalDomainModelTestLanguage.g:1319:1: ( RULE_ID )
            {
            // InternalDomainModelTestLanguage.g:1319:1: ( RULE_ID )
            // InternalDomainModelTestLanguage.g:1320:1: RULE_ID
            {
             before(grammarAccess.getReferenceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__NameAssignment_1"


    // $ANTLR start "rule__Reference__TypeAssignment_3"
    // InternalDomainModelTestLanguage.g:1329:1: rule__Reference__TypeAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Reference__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDomainModelTestLanguage.g:1333:1: ( ( ( RULE_ID ) ) )
            // InternalDomainModelTestLanguage.g:1334:1: ( ( RULE_ID ) )
            {
            // InternalDomainModelTestLanguage.g:1334:1: ( ( RULE_ID ) )
            // InternalDomainModelTestLanguage.g:1335:1: ( RULE_ID )
            {
             before(grammarAccess.getReferenceAccess().getTypeClassCrossReference_3_0()); 
            // InternalDomainModelTestLanguage.g:1336:1: ( RULE_ID )
            // InternalDomainModelTestLanguage.g:1337:1: RULE_ID
            {
             before(grammarAccess.getReferenceAccess().getTypeClassIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getTypeClassIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getReferenceAccess().getTypeClassCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__TypeAssignment_3"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000005000L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000005002L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000028000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000155000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000140002L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    }


}