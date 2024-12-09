import day9.Defragmenter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day9Test {

    @Test
    public void defragmenterShouldExist() {
        Defragmenter defragmenter = new Defragmenter();
    }

    @Test
    public void defragmenterShouldGenerateBlockView() {
        Defragmenter defragmenter = new Defragmenter();
        defragmenter.generateBlockView("12345");
        assertEquals("[0, ., ., 1, 1, 1, ., ., ., ., 2, 2, 2, 2, 2]", defragmenter.getBlockView().toString());
    }

    @Test
    public void defragmenterShouldGenerateBlockViewFor2333133121414131402() {
        Defragmenter defragmenter = new Defragmenter();
        defragmenter.generateBlockView("2333133121414131402");
        assertEquals("[0, 0, ., ., ., 1, 1, 1, ., ., ., 2, ., ., ., 3, 3, 3, ., 4, 4, ., 5, 5, 5, 5, ., 6, 6, 6, 6, ., 7, 7, 7, ., 8, 8, 8, 8, 9, 9]", defragmenter.getBlockView().toString());
    }

    @Test
    public void defragmenterShouldDefrag() {
        Defragmenter defragmenter = new Defragmenter();
        defragmenter.generateBlockView("12345");
        defragmenter.defrag();
        assertEquals("[0, 2, 2, 1, 1, 1, 2, 2, 2, ., ., ., ., ., .]", defragmenter.getDefragmentedDiskMap().toString());
    }

    @Test
    public void defragmenterShouldGenerateChecksum() {
        Defragmenter defragmenter = new Defragmenter();
        defragmenter.generateBlockView("12345");
        defragmenter.defrag();
        defragmenter.generateChecksum();
        assertEquals(60L, defragmenter.getCheckSum());
    }

    @Test
    public void defragmenterShouldGenerateChecksumFor2333133121414131402() {
        Defragmenter defragmenter = new Defragmenter();
        defragmenter.generateBlockView("2333133121414131402");
        defragmenter.defrag();
        defragmenter.generateChecksum();
        assertEquals(1928L, defragmenter.getCheckSum());
    }

    @Test
    public void defragmenterShouldGenerateChecksumForPuzzle() {
        Defragmenter defragmenter = new Defragmenter();
        defragmenter.generateBlockView("5553244557716930487729269980742158786547371147184059483617907290977496829456278733147979141536998663985716308856901469977663717996349780535438309461114643921035239035331312884033278988497280136172378266542673253613497798799315483473419152454412942029531334475110966565412429194621724174576525668632512631893910162913938118746656373422445482752439981515876266117281508310117361469719601089948675967154539074447810192486636146311114133051941478927056849830263463152438833047432744549034651426766654984069896066284297776790738288992626526116719727448314929610641480228768648447558022469927449045548625356285378018976496866798968481176463903736957119403359789251545932706069468310821910146960616423897565926625743399147677292259753230799442409748302223145346654586135740414728482225965257334659547497988033159551616528474499647730937198293280544045327374611790761678417820317038905051378176286054959747127615585133683988198325354176333964174293978464936762855465671573617356771440392050693559503176366561513181383314136128353158385317154040113374945228781046601369917925457345483582317183872292767578141255267844388593852843844997586458956193807212598527402456904116469971193027679334146810418292412786852557593454728322994915915931941112438765677463654844272854603158249072755417827481411767557030656920522825623954748128663651227672656684503728448893406242718844788721217382213369739580465531824356583165667760199530139952549970761241232483833031427533302672327989228319638281193277829056766310113612286569793981249499911590788829723488178243356770415952909344884126113933747977745564422343374257457284949124627071952663749481284877454182317259481671586662163115114588748197473564959385553246778880968278461486796274946243964496476814854271639657795799287844145884635471639782187280953751527151278743158621437557937546171525308947476824139879435683742125603651369519698872318856351677216888312242671210891724901175234351642967288255261872349755718713984765111560997471415718292479625219739723671362119676437847374420996111878282212350545416439563667061982584943667707931271390788749508646196091683618938375385344283842852871172337232155417891734751201841829619466544892245506579155071774371454812123189508689385816176317821873115144798055227757564134615142263310697198898287177470529270857373712844827428693693682077665072212319631790838573459824608967348157371253134163688145988479609417904327205213138363504719698390249659489289194091872455683337605075899543891347325759307634223133546032736761898541408357983569991622751281284976665864753065139166723627169265736866189979667084999839478195999572661826196589986155985825925892342822782743996369941931744590143762452744315831754269227771168555833924502711454625755521583436575242125024466183712493943492677326736427694734516057854835212847173631701683883251392129845711133118154738448837126261228364734522322964899211536687853998232387577078585381422392173658706072753168266241356358954830296728207189465988874360229620356772297510134937506049658311686714766330302314504928123278168265883192107957127345756130952081996282679884732160101319738237313235595773984839441024645860239041417785243966848174783651386587222123985713569882488140166174646373172881916682501672126878969456881767209961498148974772835573775247892869881535364755579688993919306949517799703285135596299681561365485123991289469037637891228420678089569479849433426713995327162129824291603725946316286993738487604416306292304062247214608428215615219027604935895167837223429464347299714885593356579828184754196467338577382782363184438769895424717694277217646277641592745797837776501858846677291631138356899776472466487890448191954799856469613359644130989083606440769447405446931927475353134097726332784035382833157534595325182595822593368452889868559592606534138286994178769994102682163471273322569423806596393219345021322054976681723022918441396664979299955085555161512893234541666879631185451199661697911432704810296099807244753383887931258614999421187131641114676268201371766272771971387717163736193078471587717762277192146492489463475362556914866610721320134343893667542189828474179352992982789388694683596119179243603194668625752471241771211328668591354977609786295650747464848828443692464516607377597148549489471164412979744975162295543089803566634617379270132487828611386551602689597953222156686042412943863799137660457390525089622437327073331749564851147980673667547074862013186494884748762989944180386211677368831427575841294033406079813087791912647442774155294354683430397514933225117528156194341469191180477612751912982619429952903485866584497435995317322559602362961596782031849270107369681566112496322322825089819573593319576089759952184163667168325879495411204044531180862067959113447192352891959922594310526360985663402439612996745719754489901852678812155881782793581859321339145443145186772148469851335298533182743235395372997763644863539796197212227213718789827031363492172569964895557675911258169960437847761787776397145753854194232513127754902383696645425672561785627189746435431350565244852689298342719243205433663094995650323974329569209891133749105734995913222333573176928227727816794618873242368983267820206384433362688686228855395641379328755953452555376435802481983029432016747665949326213981342969966179459697905413815678397471595772462528246227151268602492984954962341661834732770229619125490731191769668278837264962758123581316121035563114423384492131512946884224493547561862901075514967831473199810489350127122473253167370548489774539438610182978298586151793364515795374602019117629319447187732618430898487967021281142635733357669949291111967606277798235805090153025126885314775229588507030839093707363476397342591781059397273722035695669999782692460778939941069677752511944117424274566748783297091335553847249979319688913115219878287196347811659766549448713148824276522439685811069376684529550933260524012203336381413414361682473803691829948666662928788516266818636406021806824358667458221109285362083845691237263926781939687655673187824575943243589673522431144841332909889958949299574277111189996349291975742374477884295213878258240499533962122599490477120953895262472997817366664691537346933682798749412177928461314312478986823627126503269768752863851358387346537396222524599418213205817828092786857149365718444714124319347215897309094766394678165515133465949899527483237473527544544836467999856344543364279558767736398722656894278653852272051494621218247965854919419662682227229405289146427748412293418703329563624438055524765438070746474106391649298756017176164285778714996851083813261658258507479587484952938636113925920346481773740421056669277997421423884944943191276914480633160892697614019402156399122547810243661706352821940875117496889904591512854786163146018815958563393449114359496257349437178141272386421184363264442148581836411747985375058494680783236581971104235286327848538706098566569405129927225429736447194788645771315674837578225269312369743452548221888514069437249277633934598101853603049945970111022505379543050697152417883538319535269466919467094657153348643294032444522984975676678405424352281439927988942648567497148259598303244756523775864667455716171328664807180294774169189875928925611657997441378414635693433339757613337361729627164381283235728237247249777685689729157238876683546543740964335327285688944181471712492329187718592564152532322195618458622112811583188437719622276741626913374324946792090151043713146212385138050863882151768806573904513177226189313427112476216863890814079436753809038301335586574508989985118729997405087405596612425646442654820236966221662495827399710534187822375623776218575884277311029798778765712748134122963505632285391543939789379916441779748897111661531822788647669228756165169762867712744591513636491313525448062632759253840536318647737519285109248825235219327112467694633933097375985183954749677524736421671392539809782526645666319127777125880126946374281896562721454824859177831599560507121285563342591934884432698551230694181491127924662471449196093108610438727461180984361188535722278372669727397265786197933404732658268851830177880664916887431654578377042727542176346614796832320845953215698345998916968198284893453626464683846608884368145778355411978528395547285933292265336807225815595286363568757385187197848537846774517984764105058416118134475306378159777892087981854302578202245783665953087114421571953375958499847236132269359789659452324187782507439953475709453201753594740204396158052545646407072552855443098572999964299712334728071483821139761638251701274183712414748113534286246438170141240265849939232867434581074687369507868322573281649554034266972948731939985235832744849275438802761677814916740807978444113843583829252967286652319396065634238879262601326144967637874427091652340549853765721926210239770991475409880721865146486957545244441637587736750253446393442246120556188309318226422678437139246394449735063166154517184186814668428818715898737604919383810502370307345808979395276804727285713725379505068738185948489589763204457395334983565466952145438887086871690474559141858648428726035334149762632507797787768735827826489226061512959986047396544316938731466255930839870644630563531788163301025468340383670897823868230183321208169557199144097208777695852556848233131371536401911275655423878687172406476764841643091284474736067996531709215897629337350789414162326167191882744359722713060955286975430609834371564148479229064774757228027835073759178226374658452299864557151221535621896458730102977966538725399146561614986591737454671165753887289496423664725833772917637369412105417406953625655641419424870181466888850619292919783768291465752281810245546178769207357187662857243549359797614345610365445403522368926564587436531488266533845989327592034393295602718391550767082362387196241318523828080248782159121172990311963884762395030503814674681606485909092888842729328302833133159124434718866253138606016643085888687372488262581533446173728783796918525104222928974336846783547257947478340428775901129291144355756727490479545687162817173442778332273519735216648701957156170209465858537875947534580777481747371701922353681241942633462883049804756708130994552928090404864237413778313168256764328721363273988383478924690351455202488875778541075554955313618479285884380736153398517786991727126283532574838272614184968817468462520706312927084991368552746163136975588803080508112433296935354121317415398791461116034459856876491521740673685953444952044957860801046161698877969773746904552849062506671506375225948682258315980272398547813754469783172827535319788634037212619326746196110683076592589801015518159735721672756945033116825669390414559373391943127469538493576589969932484907138703441695074196232947096932377908117178264868318484440729911759863458233699357298041696780198012494720308578552641862552643876671528133228441869174747833095523589837546617859363318257247361098591462675034847866472564355557205790451048658480326890411179752474228373723266915393591359113277519320367393904927542685578564517996584137179231672170716191712793452842255437474882167644159575887017859875626810673557997794296615358280228575457393223381129698501194623215696361966042656666433853284533159757545193167530209836178526319557648484279646985477135897719443352648279127138174427484294192104970709952164193567931392711391889285338853141733836616511457030254051668368857487779312478869796153794314505153824255634313338831185659107013107794255070781963866273591913303122733699123582537049889122726131772274548951198151643838624262913522649612643544345547725977418457115398525463516892887577375224593783873161557977126771312542838250121336435573195077733929691130618718138128484124119378898750803397684371744785231225606068949210707428371962983748862474627621548365464695518598263362304344966979742568645317334410398525316883639565745841307245376871951085231316153391387463171320463172765624214354538937903978586111134096579756644872347637497233272142285017492287692019518948718913275455577428355022147365166252934587267562832484864534907289462769929491931333974568535510509430765011424490536181482769417545173026585328174796748087929441473115673179729165328573935923712458108546972446501084367527696258213960366566759865193671125078665336357545227844608114219521469947273548616629597086769237375460952928439952796628334857137152665579855226527260832552562826209986296031707882744167249346111246932469811117208778628869954618881976489531407540368127876037781552547832688038847695434583526541976821508167341078298518723883197197579172928833249714921636711829744141364834425228584983238140361811511829501558566790876129718118979496249741333346105432608482608947819795749382902621767344892978949074826176171956159799626030431373738683451598881924746590336639107632687835648936281533613812899869425478174652175349728955451271784463499092651837764466992273803015904647846473807547738194147599937241835050142093394282661478175846586125738994127815126196165132661746737644899892211842591463684092821160402983301448687859217163795473663384224971729243391641883189915426483163517414836597179227801387834594528333301621213658873228813725737274941650679061161450308489447722662983128672288181934338389144251571985012232553511838103693428539587768155586133982818821203529837374436234385023163472748732697992412387823016968663752915858647786858433386982366266585703488338137207228245918935150957596929612201524359717438364205694916123122413273622941669762814753896407223807534335182837374513392419860333377611135914598545073791048163445833265375918405418476863321467891523149946158435934116466894772280146591611710334667235573924884177160276671465686853132701935931546432628489936586626182784148538935594262920814977613262699446242754351795458414327487183293335069773089974053332839171498167477941338838216322439613830945787576726603992558139707154719267711666162383154891409927144667232175593348786739648540434517433050148637291987152826268646277664604273281925859363123649266521315279478799851472271163185398995216349452437826129093245550897554669083657361763110249249134971854779183553881835931659432911464732614811521825102455452395467915942944341429912345316919388776353799436685972444507499567751156493505111959981271130319535363780362637266429995839844388801637704447375296766760121795634017797666355136376152703569387788531360529752772565232075904233784921912890684116541835747178579641976628649134124174244495419895992571765336599322445053417662877926776337238121788314216539615785812785585342197425314174178455599063664456451194977979669515273896394848894120907937254162978649103298198299246743746694252013348532484975922826122160921073742354179861538332404417885561561923247012758936442673466915782552203630648652251739708357477096434378553818396423574842501912793930117288524666183060599355337943646743721284673054617186812477578344464043109160973120928690836512689356269854732775462353978755273619432197133875105788232053153040768358876936516679956525745846533841549452567481831523428118514739693241604088197846677681158481914135371518345234483537174762202755132385158310596453457488949875394149957627552760349458436544553992759480882347846620912350116561637155296039617134973838669644707998206126705820703543329929547677984410255837192632482577774850589469348251786192297490896110457428561129245480299898112664849264281046335022686161794059563987947978732312941229571873444856746047167996809037717861219544538398266847833076254851537181303775834444799562833891547735414160532590882656657143165776637634231558863587739187261719231548396454415339254453446756626623522953584092189314122012485263825093349553315438383647573337468656899378673384546866106226358761774176404881358064587711297338992334246568685673402074939736139637356922442739806228535110353523502990953420143851988422833930944764617927711059523996299814824542431153655298957375802278493249848536725342662792786957501473149615354751831293776392879821744174849456733136891030541996152484199590185528339293643517818429574092792678617093106325868242681798448876437659545815304449308297837257983942678928358657135282859135588534472724809053996821605065119757782296303133625867823954245234191239828646887753408393128757274594597320783132679135555057986695531363923691102192915619174850491539928349412289522672813517112821871421568843158354387329191946553816429340759631674875611413217021668172854075823488338329458615878095482786423983896239847489643085675317904887422550737985849612673366767137836944217319293035567613325237523626186622874224131112758762991587915761973424681235498274863459699624197218828211304873815971315051468238699965178795992025656717841299539167166094846583792783494090689759571771981060861532369686816049412890495749715759791123882540655280698971131124172238812838334520601591725661674949439354373742663887961396191121477211895814797274636146869951594642767069874069475850456018735913746926475987971792528711858269238275146414813894501375559520654348288922785751654225533293758435273523813027749291975745573617677455644476525129697781169972389366494047922036758171325270593892219960656082931873206883721451388757298818546410294254912490928230277025878280466951629249459085341268941691256344892219855636441758913796435715798280164214742869521179842677863976866739225411329848247023735939168925148415387353755750238112321219473373371142842522129911635238387296664240301069758788224326376987987145872177107564712551588831444433248559351140289284614953428614554834155267258725639965985223333540882026657554387115272080141774312896684679853785192148343898817033778164401835875026421345331238134353729372575690267871253439331095585111899553313369852374982572666952618772665922741845114160236990584962416334528927633096574120619045701587447117517629209656682737869497372672668721828760931416599169547212266936645020626085535112557217527521728584962549249089543160955727176127374629843767492316768530417224383819532678719635708252718172437788102364249645991838444841965952954499326458277573697979637814451368814140779529269733829386758664868513756287456188442436519034152964234837819313753267273887891749188532302627273235986595394977252951369118917442174862493461232617156393774811596880565738314019254556231763814060838414225751739755657992433644859436224763577896451995165242542212445838995424504446574088941968927163464265983179943067247462592433766553701647202974921931447288247781972318684491927773248219533223731325494071429581451792254014151146692295273324308557954633319439691753629489432375736532354882393242599228855151742410536139538999654720569263361899212986318056933960203083124462779764693130899582964660854259296647696927118920367254761545851253285995877958661931627396688930183284781432439862803943269127764414304750735488722493562444186999548371989999243847871485123165357037605650783748496192859381256088968873131766422757798171759598657189844895506742221112828953218759793298632644682051633075274087986290897974932047474222157223177485116550905782118933125625134884447958223338631843679596206873256085634142863841533389249567667317656074989747981397483982114586524669613346253322682573367043109689595895785776175368766046644579849321561568825080287263529173394147107061313516891187606553715032248095929289932443976910326960589875935314638950171684713156799221269753875059809443557081734410708285846439547753934398584955738182471139315828249089253910551857159117492214514584846671169483278384764172305621235999652486183717744324429929557596251877297080299069709159256578341661331117165094742961464130413540179146425369421858248436285188172726927792274354587132159034854754661563301166227734904078909469568544116340441228258210957773208392176780918383803643515796411582213938317969254239216979438387195997483371334073493025576914542682917316113254497576111950798277265838624899788338323494466550674414243349315884129435167345871090132680691722995862507295429047209649597261412675179627522111495122218039495311857757964311626591984352381855376585975540373597931479661158411636159184565190262983574784218711446062111958359674417764303131369836496974301882364472959035657761304423882586553433794475231995296");
        defragmenter.defrag();
        defragmenter.generateChecksum();
        assertEquals(6390180901651L, defragmenter.getCheckSum());
    }
}
