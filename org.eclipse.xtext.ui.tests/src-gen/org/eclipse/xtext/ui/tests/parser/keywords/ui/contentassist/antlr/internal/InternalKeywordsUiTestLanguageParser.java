package org.eclipse.xtext.ui.tests.parser.keywords.ui.contentassist.antlr.internal; 

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
import org.eclipse.xtext.ui.tests.parser.keywords.services.KeywordsUiTestLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalKeywordsUiTestLanguageParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'foo\\\\bar'", "'foo\\\\'", "'\\\\bar'", "'\\\\'", "'\"a\"'", "'\\'b\\''", "'\\'c\\''", "'\"d\"'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalKeywordsUiTestLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalKeywordsUiTestLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalKeywordsUiTestLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "InternalKeywordsUiTestLanguage.g"; }


     
     	private KeywordsUiTestLanguageGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(KeywordsUiTestLanguageGrammarAccess grammarAccess) {
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
    // InternalKeywordsUiTestLanguage.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalKeywordsUiTestLanguage.g:61:1: ( ruleModel EOF )
            // InternalKeywordsUiTestLanguage.g:62:1: ruleModel EOF
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
    // InternalKeywordsUiTestLanguage.g:69:1: ruleModel : ( ( rule__Model__Alternatives ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKeywordsUiTestLanguage.g:73:2: ( ( ( rule__Model__Alternatives ) ) )
            // InternalKeywordsUiTestLanguage.g:74:1: ( ( rule__Model__Alternatives ) )
            {
            // InternalKeywordsUiTestLanguage.g:74:1: ( ( rule__Model__Alternatives ) )
            // InternalKeywordsUiTestLanguage.g:75:1: ( rule__Model__Alternatives )
            {
             before(grammarAccess.getModelAccess().getAlternatives()); 
            // InternalKeywordsUiTestLanguage.g:76:1: ( rule__Model__Alternatives )
            // InternalKeywordsUiTestLanguage.g:76:2: rule__Model__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Model__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getAlternatives()); 

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


    // $ANTLR start "rule__Model__Alternatives"
    // InternalKeywordsUiTestLanguage.g:88:1: rule__Model__Alternatives : ( ( ( rule__Model__FirstAssignment_0 ) ) | ( ( rule__Model__SecondAssignment_1 ) ) | ( ( rule__Model__ThirdAssignment_2 ) ) | ( ( rule__Model__ForthAssignment_3 ) ) | ( ( rule__Model__FifthAssignment_4 ) ) | ( ( rule__Model__SixthAssignment_5 ) ) | ( ( rule__Model__SeventhAssignment_6 ) ) | ( ( rule__Model__EighthAssignment_7 ) ) );
    public final void rule__Model__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKeywordsUiTestLanguage.g:92:1: ( ( ( rule__Model__FirstAssignment_0 ) ) | ( ( rule__Model__SecondAssignment_1 ) ) | ( ( rule__Model__ThirdAssignment_2 ) ) | ( ( rule__Model__ForthAssignment_3 ) ) | ( ( rule__Model__FifthAssignment_4 ) ) | ( ( rule__Model__SixthAssignment_5 ) ) | ( ( rule__Model__SeventhAssignment_6 ) ) | ( ( rule__Model__EighthAssignment_7 ) ) )
            int alt1=8;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt1=1;
                }
                break;
            case 12:
                {
                alt1=2;
                }
                break;
            case 13:
                {
                alt1=3;
                }
                break;
            case 14:
                {
                alt1=4;
                }
                break;
            case 15:
                {
                alt1=5;
                }
                break;
            case 16:
                {
                alt1=6;
                }
                break;
            case 17:
                {
                alt1=7;
                }
                break;
            case 18:
                {
                alt1=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalKeywordsUiTestLanguage.g:93:1: ( ( rule__Model__FirstAssignment_0 ) )
                    {
                    // InternalKeywordsUiTestLanguage.g:93:1: ( ( rule__Model__FirstAssignment_0 ) )
                    // InternalKeywordsUiTestLanguage.g:94:1: ( rule__Model__FirstAssignment_0 )
                    {
                     before(grammarAccess.getModelAccess().getFirstAssignment_0()); 
                    // InternalKeywordsUiTestLanguage.g:95:1: ( rule__Model__FirstAssignment_0 )
                    // InternalKeywordsUiTestLanguage.g:95:2: rule__Model__FirstAssignment_0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Model__FirstAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getFirstAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKeywordsUiTestLanguage.g:99:6: ( ( rule__Model__SecondAssignment_1 ) )
                    {
                    // InternalKeywordsUiTestLanguage.g:99:6: ( ( rule__Model__SecondAssignment_1 ) )
                    // InternalKeywordsUiTestLanguage.g:100:1: ( rule__Model__SecondAssignment_1 )
                    {
                     before(grammarAccess.getModelAccess().getSecondAssignment_1()); 
                    // InternalKeywordsUiTestLanguage.g:101:1: ( rule__Model__SecondAssignment_1 )
                    // InternalKeywordsUiTestLanguage.g:101:2: rule__Model__SecondAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Model__SecondAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getSecondAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalKeywordsUiTestLanguage.g:105:6: ( ( rule__Model__ThirdAssignment_2 ) )
                    {
                    // InternalKeywordsUiTestLanguage.g:105:6: ( ( rule__Model__ThirdAssignment_2 ) )
                    // InternalKeywordsUiTestLanguage.g:106:1: ( rule__Model__ThirdAssignment_2 )
                    {
                     before(grammarAccess.getModelAccess().getThirdAssignment_2()); 
                    // InternalKeywordsUiTestLanguage.g:107:1: ( rule__Model__ThirdAssignment_2 )
                    // InternalKeywordsUiTestLanguage.g:107:2: rule__Model__ThirdAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Model__ThirdAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getThirdAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalKeywordsUiTestLanguage.g:111:6: ( ( rule__Model__ForthAssignment_3 ) )
                    {
                    // InternalKeywordsUiTestLanguage.g:111:6: ( ( rule__Model__ForthAssignment_3 ) )
                    // InternalKeywordsUiTestLanguage.g:112:1: ( rule__Model__ForthAssignment_3 )
                    {
                     before(grammarAccess.getModelAccess().getForthAssignment_3()); 
                    // InternalKeywordsUiTestLanguage.g:113:1: ( rule__Model__ForthAssignment_3 )
                    // InternalKeywordsUiTestLanguage.g:113:2: rule__Model__ForthAssignment_3
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Model__ForthAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getForthAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalKeywordsUiTestLanguage.g:117:6: ( ( rule__Model__FifthAssignment_4 ) )
                    {
                    // InternalKeywordsUiTestLanguage.g:117:6: ( ( rule__Model__FifthAssignment_4 ) )
                    // InternalKeywordsUiTestLanguage.g:118:1: ( rule__Model__FifthAssignment_4 )
                    {
                     before(grammarAccess.getModelAccess().getFifthAssignment_4()); 
                    // InternalKeywordsUiTestLanguage.g:119:1: ( rule__Model__FifthAssignment_4 )
                    // InternalKeywordsUiTestLanguage.g:119:2: rule__Model__FifthAssignment_4
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Model__FifthAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getFifthAssignment_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalKeywordsUiTestLanguage.g:123:6: ( ( rule__Model__SixthAssignment_5 ) )
                    {
                    // InternalKeywordsUiTestLanguage.g:123:6: ( ( rule__Model__SixthAssignment_5 ) )
                    // InternalKeywordsUiTestLanguage.g:124:1: ( rule__Model__SixthAssignment_5 )
                    {
                     before(grammarAccess.getModelAccess().getSixthAssignment_5()); 
                    // InternalKeywordsUiTestLanguage.g:125:1: ( rule__Model__SixthAssignment_5 )
                    // InternalKeywordsUiTestLanguage.g:125:2: rule__Model__SixthAssignment_5
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Model__SixthAssignment_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getSixthAssignment_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalKeywordsUiTestLanguage.g:129:6: ( ( rule__Model__SeventhAssignment_6 ) )
                    {
                    // InternalKeywordsUiTestLanguage.g:129:6: ( ( rule__Model__SeventhAssignment_6 ) )
                    // InternalKeywordsUiTestLanguage.g:130:1: ( rule__Model__SeventhAssignment_6 )
                    {
                     before(grammarAccess.getModelAccess().getSeventhAssignment_6()); 
                    // InternalKeywordsUiTestLanguage.g:131:1: ( rule__Model__SeventhAssignment_6 )
                    // InternalKeywordsUiTestLanguage.g:131:2: rule__Model__SeventhAssignment_6
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Model__SeventhAssignment_6();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getSeventhAssignment_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalKeywordsUiTestLanguage.g:135:6: ( ( rule__Model__EighthAssignment_7 ) )
                    {
                    // InternalKeywordsUiTestLanguage.g:135:6: ( ( rule__Model__EighthAssignment_7 ) )
                    // InternalKeywordsUiTestLanguage.g:136:1: ( rule__Model__EighthAssignment_7 )
                    {
                     before(grammarAccess.getModelAccess().getEighthAssignment_7()); 
                    // InternalKeywordsUiTestLanguage.g:137:1: ( rule__Model__EighthAssignment_7 )
                    // InternalKeywordsUiTestLanguage.g:137:2: rule__Model__EighthAssignment_7
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Model__EighthAssignment_7();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getEighthAssignment_7()); 

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
    // $ANTLR end "rule__Model__Alternatives"


    // $ANTLR start "rule__Model__FirstAssignment_0"
    // InternalKeywordsUiTestLanguage.g:149:1: rule__Model__FirstAssignment_0 : ( ( 'foo\\\\bar' ) ) ;
    public final void rule__Model__FirstAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKeywordsUiTestLanguage.g:153:1: ( ( ( 'foo\\\\bar' ) ) )
            // InternalKeywordsUiTestLanguage.g:154:1: ( ( 'foo\\\\bar' ) )
            {
            // InternalKeywordsUiTestLanguage.g:154:1: ( ( 'foo\\\\bar' ) )
            // InternalKeywordsUiTestLanguage.g:155:1: ( 'foo\\\\bar' )
            {
             before(grammarAccess.getModelAccess().getFirstFooBarKeyword_0_0()); 
            // InternalKeywordsUiTestLanguage.g:156:1: ( 'foo\\\\bar' )
            // InternalKeywordsUiTestLanguage.g:157:1: 'foo\\\\bar'
            {
             before(grammarAccess.getModelAccess().getFirstFooBarKeyword_0_0()); 
            match(input,11,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getModelAccess().getFirstFooBarKeyword_0_0()); 

            }

             after(grammarAccess.getModelAccess().getFirstFooBarKeyword_0_0()); 

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
    // $ANTLR end "rule__Model__FirstAssignment_0"


    // $ANTLR start "rule__Model__SecondAssignment_1"
    // InternalKeywordsUiTestLanguage.g:172:1: rule__Model__SecondAssignment_1 : ( ( 'foo\\\\' ) ) ;
    public final void rule__Model__SecondAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKeywordsUiTestLanguage.g:176:1: ( ( ( 'foo\\\\' ) ) )
            // InternalKeywordsUiTestLanguage.g:177:1: ( ( 'foo\\\\' ) )
            {
            // InternalKeywordsUiTestLanguage.g:177:1: ( ( 'foo\\\\' ) )
            // InternalKeywordsUiTestLanguage.g:178:1: ( 'foo\\\\' )
            {
             before(grammarAccess.getModelAccess().getSecondFooKeyword_1_0()); 
            // InternalKeywordsUiTestLanguage.g:179:1: ( 'foo\\\\' )
            // InternalKeywordsUiTestLanguage.g:180:1: 'foo\\\\'
            {
             before(grammarAccess.getModelAccess().getSecondFooKeyword_1_0()); 
            match(input,12,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getModelAccess().getSecondFooKeyword_1_0()); 

            }

             after(grammarAccess.getModelAccess().getSecondFooKeyword_1_0()); 

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
    // $ANTLR end "rule__Model__SecondAssignment_1"


    // $ANTLR start "rule__Model__ThirdAssignment_2"
    // InternalKeywordsUiTestLanguage.g:195:1: rule__Model__ThirdAssignment_2 : ( ( '\\\\bar' ) ) ;
    public final void rule__Model__ThirdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKeywordsUiTestLanguage.g:199:1: ( ( ( '\\\\bar' ) ) )
            // InternalKeywordsUiTestLanguage.g:200:1: ( ( '\\\\bar' ) )
            {
            // InternalKeywordsUiTestLanguage.g:200:1: ( ( '\\\\bar' ) )
            // InternalKeywordsUiTestLanguage.g:201:1: ( '\\\\bar' )
            {
             before(grammarAccess.getModelAccess().getThirdBarKeyword_2_0()); 
            // InternalKeywordsUiTestLanguage.g:202:1: ( '\\\\bar' )
            // InternalKeywordsUiTestLanguage.g:203:1: '\\\\bar'
            {
             before(grammarAccess.getModelAccess().getThirdBarKeyword_2_0()); 
            match(input,13,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getModelAccess().getThirdBarKeyword_2_0()); 

            }

             after(grammarAccess.getModelAccess().getThirdBarKeyword_2_0()); 

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
    // $ANTLR end "rule__Model__ThirdAssignment_2"


    // $ANTLR start "rule__Model__ForthAssignment_3"
    // InternalKeywordsUiTestLanguage.g:218:1: rule__Model__ForthAssignment_3 : ( ( '\\\\' ) ) ;
    public final void rule__Model__ForthAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKeywordsUiTestLanguage.g:222:1: ( ( ( '\\\\' ) ) )
            // InternalKeywordsUiTestLanguage.g:223:1: ( ( '\\\\' ) )
            {
            // InternalKeywordsUiTestLanguage.g:223:1: ( ( '\\\\' ) )
            // InternalKeywordsUiTestLanguage.g:224:1: ( '\\\\' )
            {
             before(grammarAccess.getModelAccess().getForthReverseSolidusKeyword_3_0()); 
            // InternalKeywordsUiTestLanguage.g:225:1: ( '\\\\' )
            // InternalKeywordsUiTestLanguage.g:226:1: '\\\\'
            {
             before(grammarAccess.getModelAccess().getForthReverseSolidusKeyword_3_0()); 
            match(input,14,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getModelAccess().getForthReverseSolidusKeyword_3_0()); 

            }

             after(grammarAccess.getModelAccess().getForthReverseSolidusKeyword_3_0()); 

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
    // $ANTLR end "rule__Model__ForthAssignment_3"


    // $ANTLR start "rule__Model__FifthAssignment_4"
    // InternalKeywordsUiTestLanguage.g:241:1: rule__Model__FifthAssignment_4 : ( ( '\"a\"' ) ) ;
    public final void rule__Model__FifthAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKeywordsUiTestLanguage.g:245:1: ( ( ( '\"a\"' ) ) )
            // InternalKeywordsUiTestLanguage.g:246:1: ( ( '\"a\"' ) )
            {
            // InternalKeywordsUiTestLanguage.g:246:1: ( ( '\"a\"' ) )
            // InternalKeywordsUiTestLanguage.g:247:1: ( '\"a\"' )
            {
             before(grammarAccess.getModelAccess().getFifthAKeyword_4_0()); 
            // InternalKeywordsUiTestLanguage.g:248:1: ( '\"a\"' )
            // InternalKeywordsUiTestLanguage.g:249:1: '\"a\"'
            {
             before(grammarAccess.getModelAccess().getFifthAKeyword_4_0()); 
            match(input,15,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getModelAccess().getFifthAKeyword_4_0()); 

            }

             after(grammarAccess.getModelAccess().getFifthAKeyword_4_0()); 

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
    // $ANTLR end "rule__Model__FifthAssignment_4"


    // $ANTLR start "rule__Model__SixthAssignment_5"
    // InternalKeywordsUiTestLanguage.g:264:1: rule__Model__SixthAssignment_5 : ( ( '\\'b\\'' ) ) ;
    public final void rule__Model__SixthAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKeywordsUiTestLanguage.g:268:1: ( ( ( '\\'b\\'' ) ) )
            // InternalKeywordsUiTestLanguage.g:269:1: ( ( '\\'b\\'' ) )
            {
            // InternalKeywordsUiTestLanguage.g:269:1: ( ( '\\'b\\'' ) )
            // InternalKeywordsUiTestLanguage.g:270:1: ( '\\'b\\'' )
            {
             before(grammarAccess.getModelAccess().getSixthBKeyword_5_0()); 
            // InternalKeywordsUiTestLanguage.g:271:1: ( '\\'b\\'' )
            // InternalKeywordsUiTestLanguage.g:272:1: '\\'b\\''
            {
             before(grammarAccess.getModelAccess().getSixthBKeyword_5_0()); 
            match(input,16,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getModelAccess().getSixthBKeyword_5_0()); 

            }

             after(grammarAccess.getModelAccess().getSixthBKeyword_5_0()); 

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
    // $ANTLR end "rule__Model__SixthAssignment_5"


    // $ANTLR start "rule__Model__SeventhAssignment_6"
    // InternalKeywordsUiTestLanguage.g:287:1: rule__Model__SeventhAssignment_6 : ( ( '\\'c\\'' ) ) ;
    public final void rule__Model__SeventhAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKeywordsUiTestLanguage.g:291:1: ( ( ( '\\'c\\'' ) ) )
            // InternalKeywordsUiTestLanguage.g:292:1: ( ( '\\'c\\'' ) )
            {
            // InternalKeywordsUiTestLanguage.g:292:1: ( ( '\\'c\\'' ) )
            // InternalKeywordsUiTestLanguage.g:293:1: ( '\\'c\\'' )
            {
             before(grammarAccess.getModelAccess().getSeventhCKeyword_6_0()); 
            // InternalKeywordsUiTestLanguage.g:294:1: ( '\\'c\\'' )
            // InternalKeywordsUiTestLanguage.g:295:1: '\\'c\\''
            {
             before(grammarAccess.getModelAccess().getSeventhCKeyword_6_0()); 
            match(input,17,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getModelAccess().getSeventhCKeyword_6_0()); 

            }

             after(grammarAccess.getModelAccess().getSeventhCKeyword_6_0()); 

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
    // $ANTLR end "rule__Model__SeventhAssignment_6"


    // $ANTLR start "rule__Model__EighthAssignment_7"
    // InternalKeywordsUiTestLanguage.g:310:1: rule__Model__EighthAssignment_7 : ( ( '\"d\"' ) ) ;
    public final void rule__Model__EighthAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKeywordsUiTestLanguage.g:314:1: ( ( ( '\"d\"' ) ) )
            // InternalKeywordsUiTestLanguage.g:315:1: ( ( '\"d\"' ) )
            {
            // InternalKeywordsUiTestLanguage.g:315:1: ( ( '\"d\"' ) )
            // InternalKeywordsUiTestLanguage.g:316:1: ( '\"d\"' )
            {
             before(grammarAccess.getModelAccess().getEighthDKeyword_7_0()); 
            // InternalKeywordsUiTestLanguage.g:317:1: ( '\"d\"' )
            // InternalKeywordsUiTestLanguage.g:318:1: '\"d\"'
            {
             before(grammarAccess.getModelAccess().getEighthDKeyword_7_0()); 
            match(input,18,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getModelAccess().getEighthDKeyword_7_0()); 

            }

             after(grammarAccess.getModelAccess().getEighthDKeyword_7_0()); 

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
    // $ANTLR end "rule__Model__EighthAssignment_7"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    }


}