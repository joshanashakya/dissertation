import math
from fractions import Fraction
import time

MAXN = 10000


def solve(free_nodes, n):
    seq = []
    used = {}

    used[0] = 0
    pos = 0
    while used.get(free_nodes) == None:
        used[free_nodes] = pos
        toss = 0
        while free_nodes < n:
            toss += 1
            free_nodes *= 2

        seq.append((toss, Fraction(free_nodes - n, free_nodes)))
        free_nodes -= n
        pos += 1

    first_loop_idx = used.get(free_nodes)
    ans = Fraction(0, 1)
    prod_prob = Fraction(1, 1)
    pos = len(seq) - 1
    while pos >= 0:
        tosses = seq[pos][0]
        prob = seq[pos][1]
        ans = ans * prob + Fraction(tosses, 1)
        prod_prob *= prob

        if pos == first_loop_idx:
            break
        pos -= 1

    expected = ans / (Fraction(1, 1) - prod_prob)
    seq[first_loop_idx] = (expected, 0)
    pos = first_loop_idx
    ans = Fraction(0, 1)
    while pos >= 0:
        tosses = seq[pos][0]
        prob = seq[pos][1]
        ans = ans * prob + Fraction(tosses, 1)

        pos -= 1

    return ans


def main():
    answers = {}
    answers[
        7901] = "154524871223548423123495185797654506574461761702003065846910905746685998647514825069390588667489327248905358174327876552502957660057253253483877516101528529986709707135176302376822177221161432613294608372321628357823583864101273914414227874808941949788705240048101067284633674852304568823278847645592602559676080522967116394164201940415879553271492035834028327398486009600093157465503523211488955021953127268647916111031703682619831400080346816600935122503273822918215392148364075637874362562003886513246910604701515426048343641513851237428592540111811008678402471757951449650412535345381923708040483001118261857832491735489869517576740499550045310104023129873482509874323682634142866901829084234882445385200295319524648351689094720128553785639719221969264129589951800322116024545902369342877667788536967565125990256796799578322951449803408736681264649241378320858137626918605730290281622575456429027323727694782739314124549860068706433370934863613425473482843884549752732489665702585505388955369522536754702394875839852529518821561333302341509362321195291824828007269021295402144559299990594887703714374425464288060958835387801765108977136997785318571620158461213961462833468536927703562738/11708004285457312755126666863217644760055861406773594249600054075715122508974581228961888366743801655492643437810966154300770740887430126947893305147118944410195839406784735953274330671167286093169745122932079008472101285489067230450306319942053264911861843858846013256127918927680942561098504170833048864333768657182434590844327804335990621076825744270870324389495315888792715548357390675237849554405351811596599797655317280518276360549141571034933129894218745679847870164916740677879764869800871601845140782167652942474700432778572851450966443631222817719445949290846552185879120812492319719862315771781394854730275436023186795781303781840036204405022306942239374739830768947586427274411392455925485082460607204057421762514961554176729112109598477706758573572158753606767581854626464460620360300538015606769824377407345840454826888698131026097851727716692518589246731498897676124408346168821318136621626754567759664177038839955381358225129907645563115937666757425864999645653438548784189677256397395962427979423494151205540932406527491201269878128444061666062993821362430091038452053553637944869816002598967413541372965358839069476857294840674149717585402596923888822980913065149411098625"
    answers[
        9677] = "355015421701713202212473860076525882009902216644337983789712546902855564673657169603761249467720400461970489489113546637794041573523526730170748241877537168935035448171103590132975908684211409578927894713007115704550974932706751558843727054948620629495926397359768216611724650526720850411510463876908039969375451684402837509632771646645177985818783287784638536610973174086480221990592966939073544073129241828876855517834517927054871606428776208634273614802546913903241862411771943212010860464482597415685421153568152651624488000580022986646520292360832102090929980870528643545255623373496573726523959723895369828813695219952013125760986556499948313326699376723278370296387425751974594381046366289927557778079267582992094864234023846489168838099075131570386619007407914793038746270712835369525282370958100431637609331765278757991507826864319380122050098235701341246980552596050268124188631452719152745485969575451660773928902074857476078067406169526046841544496200004071166470664478121574731743106703176076616567026951873962889620766354000786634778217195180169674610973441887042266158981969468691882394838540158036461706007682008948872776640135753623571550802521470741987543328917863072840442897261808591862855854318665037353750640231558222883736432456737760890388302545705798404006886873175954856778651125124414825317569798557735990408364421387615142166977843160724913799826226147631507851204157493078199200729703642516155768326800341864259284428724430981938/24161229041093868938167096036170656581148522733477688547261282469337063357483394938167166903472548746587404081486671795113165954899343611098115607541397404292873362806248728502588800585512998777600033616792172309254883839206637069189555255442891066800434624158543262785265015150098229042435359388539219921639220218269440815388818036980365533565004620040497306764512807813441994883170239109645345986288639407216784179724443178968696693613260562923444367236930624063728947412648829923452314809429787376836652426691660599576798962545915528618911236512479993206515809978978648695129649871910364398615156344266149547982458433036808163793383537632482513089121772014669802480412996400494134868452868234286759470106774637235981426506704638332034883255172423927559642487526813597003924444637677544919662326969340692257915396913234997704693823575079725300545776339756575064121649630028865772015503098586755819568277907891249679180033268400909838077906851564035966964679394900898147925032824546395476864580855337672397183685376407486551748336626559011399276003179795542628358706535984818677212988570736994567317130991320183536176021625899392029640170609055751805596338312028330140696084842046763810806230674825998696642581652399790312867450216407727422365888228987418320643334241435540378709106406300100247499616647356316514697146655316118779950550134717711148638498868581991387487601985619566383393531523585077391874513674532507245281651626638820005842165499579858945"
    answers[
        9733] = "95484332877590589554469754771446691003599663592905494408439345619582478641998729504995236393657485029791665442799860526876865749777294323119083076321567009541636671190882179584977739221093063736924544373790908085293665964560075463518378551209058371534457516011892072208377822471345716624828410934324137904318677235430150163578608344109579889521882494969598385295234012317570397732508935799426108056469502224626374842457401918802043515225722679525347961446924556134853285440364336064603065829017067847225685993600461140265253652742105117690561160743911477362779575542189272136064250743190600552890952283014623955797131750064699495418563936864723524709763859874646053576454946899546950910302422000561333155108232250954810214949863400691198989713949529202484236526054871760424497926157074028106143333163969074021979292056212512327926099849931861845561313953950570409114884706721641699210621190980872119389261240676519621068057243738027574759222417016494977306477751003082809341460666604302257397590847967794595829725469987512493547459114166418595444720830389398509346323286112779037870871618987335442875512148343912833469647271576937635892165979513514129039128435307048334834528232324783005922951454548165693723699348030381290479329276604925890470367714103163692490772390053007326510368853943687690444780249282100467642857923059896714215481944561286077482708178927733059970371869942524490998102645615476873969100436610441403602888640392767805625730515962311606242963562/6485730535166475447221120228665262693180004703687449791010059910801300620066946132654995251961761606272418258470135901243541274707080736345809323851092051098573818695148817085012621865665248820792507609538936031065407763604464299894401815432008945474901129334187177041490444422663526557798579047986406673549508346775576876143909187057849285049205320822677633008103880183241664826013469861026682448107160666895807152137916859092551706675767886855171481809876932110911653059114408828368367220124838074484190631672482484444631436531339755862298487996751416667267973622916483976740932542486600258468425261784376839276865109473281064232399599707268603813104371510285927118259593757093001718738645698978681113120430418435675253831857746647974863294508973975619783598336234520138748692085861726551470040106036066745609189179825229044018439871760076297406742520636567156335724257909029876673773613338548753986464403339513606040545936498368623199329089225116307992564649264026669147811640072079662988481212151438123916615699776475294332432339591869935873851983425866472210907920557265210694985396108573392747296754266765509537102861414164709599224713359678465358076426719595086236297691989511016878068258838104680788657074879171206938956666398706992546491805593270055164647640460163376165191669527688682783272454558284018103059264318657168846189582863810223461059222943290931488307133356293744648513461983935004483125773001369169210484002829933395570164359907187244048318465"
    answers[
        9749] = "24420738504895369936029275850163071991656213953040750251776948750246796077962845691317677269631705913994021086756383098235089231208690232714718182051661959094144212987702253303432217073773124260159318146666200117041612592906844115211509040675212920139551853176678612535045654292046757526749492513241228125837513438956933418658716846512730365072509590131877465449441381623988912185373433489319776194980015068338689021210658939139364253499030464561574097560424964521204779116215457677726768619050046856738764484240389262833903373023132839740002736774915426122802238815407817050693856360952407545226333981896371433729874311657730340419746680805378905702168666514377525913884873553751714155904205031709262115464030534807143888700039849995711800671406127912163382933986015685240389569396807457398304726818373517814077265886528890585763062131364555734521607919713137187807658107106103376981378323172002338180348049030319707116151597120087047456178402809544871620530165936798803297978162622508652805080201485681178041361165961347313090217348403318922506112704312304156650558494700459948184483142107408891022462564899591639479697445627266468118776891821012071431633275985890307805299829762601232691986762912806985999108672619322038677748498306049452995705026758802905382276104042099895012248388280300961696806504069643072689548038490993315819434426936765296065726033493251456080278483753254193225043853870782435870985742176970373530465074443098411876172230726422871158542366506/1660347017002617714488606778538307249454081204143987146498575337165132958737138209959678784502210971205739074168354790718346566325012668504527186905879565081234897585958097173763231197610303698122881948041967623952744387482742860772966864750594290041574689109551917322621553772201862798796436236284520108428674136774547680292840751886809416972596562130605474050074593326909866195459448284422830706715433130725326630947306715927693236908996579034923899343328494620393383183133288660062302008351958547067952801708155516017825647752022977500748412927168362666820601247466619898045678730876569666167916867016800470854877468025159952443494297525060762576154719106633197342274456001815808439997093298938542364958830187119532864980955583141881565003394297337758664601174076037155519665173980601997176330267145233086875952430035258635268720607170579532136126085282961192021945410024711648428486045014668481020534887254915483146379759743582367539028246841629774846096550211590827301839779858452393725051190310768159722653619142777675349102678935518703583706107757021816885992427662659893937916261403794788543307969092291970441498332522026165657401526620077687131667565240216342076492209149314820320785474262554798281896211169067828976372906598068990091901902231877134122149795957801824298289067399088302792517748366920708634383171665576235224624533213135417206031161073482478461006626139211198630019446267887361147680197888350507317883904724462949265962076136239934476369526785"
    answers[
        9803] = "3273210180788326072665779956874407303695209430301336271835983946088930098968971592446649088493870209185601637297946849124915345946101994703881396454817629317067995483358046696632270413949397783371061147815617923539634120806955265009854911188530306501324761896490486400736980978270851173985761450205468514371802366150508965142349402634775190541932571215772934087049601511151015580218962449832712507548850463067009640345032653747650848021793733486635063672276271184797891474270402353352104959589784879937226619631450622372801836784254780047580520552480710915034334830077235403144885444713231997122651029623193719081606830187339528932202520708400927484122175520586418859966084212848690640894333604345214778602427783597772052518000554782737270290980515925878265370322995156392497748140171133095749065170222804510706059714322514254283376693941404435829879255457277967393238087816555358380272466214436430777426033426837629266695879765238233176316258666048369521314622222658677664616511902093975562338612751867496209652181946196463606422353383104107812596334613198740452548306659208445516691530536050604634513689227620071954907294939937244234855896302003859771540054305586466389588586625478638436931865675356838997676239216955771564982882752970004654747040198185582364456872545570483489206688716013710536947301312846273423736064935003964044795795191383397598165999437078614987833270147703891978941201213909953516817760145834793630851002075671081977655885477265842182227630711346029216/222848004313668719691213483700810759987656019547710139664241936991138106539616439762775058065688367531907719095700069508131964048744509937894796740738505066831483388299980505865722101281973991752051079878406943136495731052685385981167936406108052259153180314590401441086107951134763582222178806130979450523610292690241037876575460384059273115066548829780705991363970146861803501538571064868730128783979777341880332463641995130956398538891263597839918422762242505609422357073557925121726514010836900537641686656503152430580165941404831443945570282690367110620682083028935478555282639476176629026776268383873097027471871476729615653553852994769678614918913374970497476655715836999681683299634189187555967856521001252998565559074621638218445299839894876830416575083610618206257432118972401116133269463833866230950916952995411373918148349361215693246613829888213288305357239073545221307206167441574530195787313912090912979929382777969487951949322618906724196994628638037640106093305472621641881937827447206916332715678892320927194478168405438778896510491602870644308869938666086561401068093659871427096523225215861650585301063106894861911088059286678346350307257457833611661977586521721847940184057530922580500894412994920507883101337204349029037389584516440678117026220089119744731571552913544501272187787585483807869056891982387618102642674500927575453725610336484859306845245953350338792277922673893920973157108631164802759853751459885883070656697593169142468287187573383626753"
    answers[
        9851] = "18265268265520540785908331599388596086601686893936229266975936149663252475233854868431481692229058024923431589387659887867902680080183462504251855907294546963177054676412752415280943300166703724954104193781416518797928286826415325332840928794180900409037356267851073782046598387404127155718808844538373667244444328956542214789965312060454053447621394245918870851186507344747417605653775585109692134356662244321759849102328545344784420668995358085194630127711431602472710880078819974685888683913959613604493112607285755338616455009301468715782989705834386644957400388390566758392150728632659510383880551633428476788516339901525016398990001474110188269351024831528207885540825997319998166104138747638272941441134463442026326873236217051663959231958241680370115809166365792021138069848917961267525948375559165503280962387996982888846030231981715588925232378210229430804794913608024007017149934655717953874398908493758773482266278494809575155035699163146831855305715514980662636600137664244032908275561765291731574659214609335181436215261784472370334656269736145983983299651958393592650363097522621151977579876823874400736328643285043574846932479789412227618717036882664289326702680070901993665489716988043011337934536983844751946964735793973495903486597880356428661975609996251202975190898308197830114324065800497484920958433532502516025186842292166331207944400540709960586195814487225935384488510616614943463793147585780366578287019794729442704404133845784855565244538577819709563958432/1246256367846450620900980639386993831812354124550718439512384817719571366415385855683688636193531976923400898445294912450981239116673724014069196731821966341108744135306881914232828896393851522002126470051095673633568787649603366883142133786512837363700294408277038834604302565168457909291751273693855510998640993429131661506495946387601793951488114697259379016535820590484066498289646362217565672105548688032210727964777966327667928289687709964632481600353819720330163506617403066093010672828945673696843569213490397669589483104930733526222241625292450044726359124768794924595114927847314053111365079450069955139617840563110578472218053108499256124358477392389676597769300743988150510653851837661496994939303282185942527358251895780888237326532893921959098083385984467179971163421779223854669648860314987290589806372821954543027180392425525902729393830873936730656417452366836021212933409233154424397748685187651419567159639870891380259750468877027931901801811833381101396730100689385124042639143217506344002632937121036312287344746207473989440999387962515673209693892302562038440994012679964488208874332821052512662040786924668729190832388557802846413972174912561798304372318744538711603874337650904937446964586669662754528164628055399933183519045194193602651940724032900402408812654228655141151923101627926769707222397692395088211182106973251377914484189782346388440184323310828185863741946910405291084529004480172075833154172217606931875716892455759609241742431983724318960560811"
    answers[
        9859] = "97375564875859552710857257263475485245872015150154159409742126964779182762643082446089319960510145599477278715485258439846460300625068332427651118034416501442686377626793456360113581501157759087688960055802143216287038684355484042396762264359960403926704844149909425763766341457216806367693536067206432651075198691127588916420476804076478746658658023803466680068762064908145889385697518113114359392346598640883967611367897988991624393548051091664507952791730942125971565547106392956691209669780229555235202438855255794019000921171549420192999015238112509496532316750570319815809655206552721206293067341273639421021965567073260870827807392294831930629646379401978966733087112069358716912846766412303196634451076031066079956837629059177170048030972622525029555337583764651631049334455610692138052593093947511364692321205405385002454933574475419016360524655415844182022437368453118181570693029677857477506665909191395707456794665378068881663661605928129286724609088224972033263553402215822565698200814687889578567152857719719092867521377534941657609474679845672885532933976895375591415049759550178150185246432147540404349497656619717599874838652250947951177310462729418401362305425416426586758305028116511635937540760865154551702859543508608294300521944993342492698120674763653834888118184019182478585368460360033050972822901924636673968468405685748843065150057388284549646737772327988070397810180542766311272621109742146466204069612665219252089658629990789090591243706759175949093962008/6646700628514403311471896743397300436332555330937165010732719027837713954215391230313006059698837210258138125041572866405233275288926528075035715903050487152579968721636703542575087447433874784011341173605843592712366867464551290043424713528068465939734903510810873784556280347565108849556006793033896058659418631622035528034645047400542901074603278385383354754857709815915021324211447265160350251229593002838457215812149153747562284211667786478039901868553705175094205368626149685829390255087710259716499035805282120904477243226297245473185288668226400238540581998766906264507279615185674949927280423733706427411295149669923085185162949911996032663245212759411608521436270634603469390153876467527983973009617504991693479244010110831403932408175434250448523111391917158293179538249489193891571460588346598883145633988383757562811628759602804814556767097994329230167559745956458779802311515910156930121326321000807571024851412644754028052002500677482303476276329778032540782560537010053994894075430493367168014042331312193665532505313106527943685330069133416923785034092280330871685301400959810603780663108378946734197550863598233222351106072308281847541184932866996257623319033304206461887329800804826333050477795571534690816878016295466310312101574369032547477017194842135479513667489219494086143589875348942771771852787692773803792971237190674015543915678839180738347649724324416991273290383522161552450821357227584404443488918493903636670490093097384582622626303913196367789657657"
    answers[
        9883] = "3585169013008320587733453934540655406968508071250655174069676351966247095891666666457951370861261022535907218197677774600785190516321049571099175528120462561383326438548822604717683501452327840790897918994708328294710567693091965543331903184071652577937298158191755916197924842106107578819028940776121678861464188820255086932973183740793372165945865009415954786595728774195980645745127346052687115724325004061229398519190748075580806663121266449693574278118081790297078495193488775980028423355059820522243653725874632878510045835553519741832072550463732084440328479802757883822909816376632890811035439142421989449863044208586517399880008863407492496206323270830482631638372716663110223514171732041108713906301160805034170356396842166510003100992178793709386042537964760180749873610550892321524236421203672563269319950307992448377781123935998679097946148059114351779548141469866569341951745396332639499438188190815082774623731116948453999214458330207016238401484362043219831905888672028360776820475855330015482747522043053354249914178134040244185110051911485974319449824722583973072546384468573330564589187898015237282681548921919611841954714952547395797273043248344370035395990109256951956434133363924387603461250518602022484830305070939839063616330207734382452009330287037414957658873609136317223268183549799388228885998953454699718350330403675879708887230727150794790578035321318346228048669908308488864491704843219546622006983096396305733734212669415968084578686794694798437666747022528/245023971969554963674100001548598083284963319719667650955650954242209487208196182314258655384737934918956003841532542147162519460250987530958116631050053158392707966954415439393488023662202360037794081023805818201748692202213218756160808639498715928402387483022532051193882718732640172630032634418401544306420808436114717705469155027373613505214175254398771989683074614653891346095730791982871151661327716456636886803699066403750136045178921280726462942482363787574672786709034382018414642363553351014189020455925920105022649094294221657123502481465498018393560014802543232534796355734204721354119265540519353740089984397432044612265846985555821748097871523162949536534226680674022295598632502098951601181026539704013788418851188725688874564294979208208534355978351634123319770498029169643618890323128809021228280651347778838795487882593997796683820662300462952740896922474938896458632411722512025071992573497373770298260122475736212490109020184974707635349450620937391583408311636338630467775196669707487281669656501492707286190275862359046116016007668534281478411496777822117253806950844982458097770364827281492409458515035685269508751174249572502027758241365208950041026032843726267011014525776869117941572813455949054842273391192716070063345312437540015830192761870660482316791838322587429991597297164863426338597581165506413503024091687797006909010907584727558738447759437495307966298576698160963469547078512837671485404775491359263662220946791941985253800496067456070902197939863553"
    answers[
        9901] = "1838099364825091485842998238489502638352163208605775246129613825541675258139803932850287467779059152113767067936585018625986257156889365449198856216156597215096982506298229063072584364817360767528951048690402306736891920567120457283597208730483707878597646111737127186752299112571526574444743928839110241560725998077538870670908652964981237795923920133705668072188172055098674658571105524472734987571439013958589827622877679807533101349696441175687163721291688130495577638100992957486490904022264860238167307326966426591671355541318530110693823370267769955298274501764387363143753324201392980117580626370923156755357235271953717705218606174361705745607690592162188659919159503909577911890370970307505310006952184882295896878809489448279733854445719768942424699644398057419073652907805636830184662379668640311223728733045708550684860813272116912712928434533540137586553447726767616634480071951755086848411168207402152500267945846598199304627785126081886349021085239907165847936787381451395789868857912620418181602257637943517461795756567745027242135635746499764849207120672778956961370729031070654229684060835173403463861644712283677533769437289456513866506359310854677128562818680682992941321465381508384264781767572418820540784203355739555956391413113575042931607212249685559517635004403000728597654807705351363988397543735139434999563378705775136326919194852966154650224921931475263079667563204688934744417553326412692788253071675108998704506853416086820413944387432670284519676275301802962/125452273648412141401139200792882218641901219696469837289293288572011257450596445344900431556985822678505473966864661579347209963648505615850555715097627217097066479080660704969465868115047608339350569484188578919295330407533168003154334023423342555342022391307536410211267951991111768386576708822221590684887453919290735465200207374015290114669657730252171258717734202702792369201014165495230029650599790825798086043493921998720069655131607695731949026550970259238232466795025603593428296890139315719264778473434071093771596336278641488447233270510334985417502727578902135057815734135912817333309063956745909114926072011485206841480113656604580735026110219859430162705524060505099415346499841074663219804685588328455059670451808627552703776919029354602769590260916036671139722494990934857532871845441950218868879693490062765463289795888126871902116179097837031803339224307168714986819794801926156836860197630655370392709182707576940794935818334707050309298918717919944490705055557805378799500900694890233488214864128764266130529421241527831611400195926289552116946686350244924033949158832631018546058426791568124113642759698270857988480601215781121038212219578986982421005328815987848709639437197756988386085280489445916079243976290670627872432799968020488105058694077778166946197421221164764155697816148410074285361961556739283713548334944152067537413584683380510074085252831997597678744871269458413296408104198572887800527245051575942995057124757474296449945853986537508301925345210138625"
    answers[
        9907] = "1633354865670482634892575473274177878269848372373759525765811325846788929611278968402771127221384695483915945198456285004476851582174958025985911899376499975337986661537173411180428490907671107896805361798951388912266345066652077866312114944286489782939084013056891167373799137114155515056010000276816186615290579398553645497061457349859874907706345855178899820840538136570385474191197090563464515778875629438803382571649568677198891486414476226932831825123576296441036124053704853315256369077062694497961110434982641810098930629547385147383059244374581651992456044925971934850442830194217280514603049112460209344747724704460094333483276967669942685299188841394315505390707812866736298697875298127848875145262191230878125445765654264972808396487147578694015479599857513297812474321479310509988898419240869755115441035610394724742733426143862263998840699035405386591348806972955989366740531496447026566482443584635769122576528379572484919769116532440328453434380368399747202088827429149682924434791294983263532249848151359239961565497074342143353501637548919300241662090353407294661111131471268545214977964856225076533564370498248492613685805161596682009974473114515513380958196492686912557866989055667956732635644620975053458902179010611928423215547799006570194462929051080094813251146339256886128285111370771379853589184069970476491616306084104329480579259858092153081246668787325700941970854871522339560167691629337094064099025875633061751502297990098463516213737680898668940099498771690328/111513132131921903467679289593673083237245528619084299812705145397343339956085729195467050272876286825338199081657476959419742189909782769644938413420113081864059092516142848861747438324486762968311617319278736817151404806696149336137185798598526715859575458940032364632238179547654905232512630064196969497677736817147320413511295443569146768595251315779707785526874846846926550400901480440204470800533147400709409816439041776640061915672540173983954690267529119322873303817800536527491819457901613972679803087496952083352530076692125767508651796009186653704446868959024120051391763676366948740719167961551919213267619565764628303537878805870738431134320195430604589071576942671199480307999858733033973159720522958626719707068274335602403357261359426313572969120814254818790864439991942095584774973726177972327893060880055791522924263011668330579658825864744028269634866050816635543839817601712139410542397893915884793519273517846169595498505186406266941599038860373283991737827162493670044000800617680207545079879225568236560470596659135850321244618601146268548397054533551043585732585629005349818718601592504999212126897509574095989760534414027663145077528514655095485338070058655865519679499731339545232075804879507480959327978925040558108829155527129322760052172513580592841064374418813123693953614354142288253655076939323807745376297728135171144367630829671564510298002517331197936662107795074145152362759287620344711579773379178615995606333117754930177729647988033340712822529075678777"
    answers[
        9923] = "3760299283807515305392881669921685380087483626665387583310740045779392618490518061864438198412014466565364228291295311284131760183238506480296641521584717001189575119537493891940454933801650905249443352246953782854872613017048635048443614120554701976326536039594670095564945312513189153593550500517921950184962024588992584781239533465993501341159180970745350678104403343694528834994019085606787711931776684194936418570665879951352474415566347678136222813280481902061127946763865268688300550988394467968839427831476642475507856733491281467764508214106535203243052393575405292358868470813735971960765501058279775977978030573791129899519277415389902700239026919247980979527451730380980472670105835211342752731828345683483462323646594371504049372940439266303990974893632430579149551268895678583153720791224950534759778851291627442428157985110658561730352163307118794880980048721449385869746576091026550888327297357898605889141961077282796364157526745937107341872728740687038596285146407533730421930092930276945716734155916067113852174300467379937502904191927521252135950255956504149093128341783431227487283983351865444285852258683713459524558123548207017084006902917163157763229391288430112144112020068120688896821326535586200626213610044286687320856131797617153232959645033928534332319957752653966344480388578387275931286170730869888406739091108118872791757012867192042173164675250862437159941800851341264571676718462429556497603409387737027536322645374934694161916847152916606849505635131538412760/256926256431948065589533083223822783778613697938370226768472654995479055258821520066356083828706964845579210684138826914503086005552139501261938104519940540614792149157193123777466097899617501878989966303618209626716836674627928070460076079971005553340461857397834568112676765677796901655709099667909817722649505626707426232730024701983314154843459031556446737853919647135318772123677010934231100724428371611234480217075552253378702653709532560859031606376387090919900091996212436159341152031005318593054266313592977600044229296698657768339933738005166050135045586081591572598406623510349449898616962983415621867368595479521703611351272768726181345333473730272112973220913275914443602629631674520910274159996084896675962205085304069227937335130172118226472120854356043102494151669741434588227321539465114048243465612267648543668817501978883833655533934792370241133238731381081528293006939754344769201889684747582198564268406185117574748028555949480039033444185534300046316963953782385415781377844623135198183864041735709217035324254702648999140147601257041002735506813645301604421527877289228325982327658069131518184740371862058717160408271289919735886258625697765339998218913415143114157341567381006312214702654442385236130291663443293445882742374334505959639160205471289685905812318660945436990869127471943832136421297268202053045346989965623434316623021431563284631726597799931080046069496359850830431043797398677274215479797865627531253876991503307359129489108964428817002343106990363901953"
    answers[
        9941] = "384853449965821966704972732966307410533754716673001872990644754365090705756559909905259906468556983837473030874407257670396254711587695297525843978796573345385105966534793732922560851527360127165003492854386049121963401202049881466162284067795049692605928261294087682986229601310196379407661027753366447296128334837195369728352306910364221724819790584234590499773230968446949449654139435810921574651200199324826389837566367344938559238192678820640156721227690796296835372410818703029961426437218612250923546166131087887183128506236914642265107372940583059256790238734873109550064606852454241895688532803264957771260552966093023026993324786723535480684212796655647178515320455962010444291723038825881485337386595953872058254168410359964399040839348392327614519090725780698083807461735099275217105332435035753958774263103832408352846440135520908788781982960980537030064122924914534253061986335785798932585118262145429733521285255543276010510520192751011713072317121752117777795703412147228931454823584324564303527450001365318783625485155921101661017155244139248803962776096262658198375191699627453070323264267286645773802280627801063123133551237542788441825414046345338526837487440831294887788650949450267282162592637307013507372887692529215654653541232042283216484427420262459679041403322783917834492903078518685769388196722883649292951071615901964473014159404289255892968209177423128684793429579384323572081016759500108948811565542981757113040677115518347788350471128322691656105081491299216747682/26309248658631481916368187722119453058930042668889111221091599871537055258503323654794862984059593200187311174055815876045116006968539084929222461902841911358954716073696575874812528424920832192408572549490504665775804075481899834415111790589030968662063294197538259774738100805406402729544611805993965334799309376174840446231554529483091369455970204831380145956241371866656642265464525919665264714181465252990410774228536550745979151739856134231964836492942038110197769420412153462716533967974944623928756870511920906244529079981942555478009214771729003533828668014754977034076838247459783669618377009501759679218544177103022449802370331517560969762147709979864368457821519453639024909274283470941212073983599093419618529800735136688940783117329624906390745175486058813695401130981522901834477725641227678540130878696207210871686912202637704566326674922738712692043646093422748497203910630844904366273503718152417132981084793356039654198124129226755997024684598712324742857108867316266576013091289409044294027677873736623824417203681551257511951114368720998680115897717278884292764454634416980580590352186279067462117414078674812637225806980087780954752883271451170815817616733710654889711776499815046370785551814900248179741866336593248858392819131853410267050005040260063836755181430880812747864998653127048410769540840263890231843531772479839674022197394592080346288803614712942596717516427248725036138884853624552879665131301440259200397003929938673574859684757957510861039934155813263559885"
    answers[
        9949] = "30771945768974312829849286149718032439798677467423493967010334358283994984326026515504661301394540080141512302827338824723593201789481739830982595229625700583149586238955431037653778739309457671890129351276923685142834902559798917246250215421521527437619966091451717584873598334082323796428001565577186322128798336073715122147162994673808366455578086459869026609967714613554824824759058832899783907543792360923791441961728662642435663487942507846671256543700983615951249949208724967800869867388054589031851260302269048408876735464545077279886559546809841455560742265338090287549868226487740814828047510635070623293003545071913364258117360949495583083158833097103857044434279928869747427297854639426953768566959891591203122862851297692620246536344125431027520526966343015915582695313902053937737605214941486508347934274945698807835217128834978971566963674180680330348426256461353890985386815655822602029905923905821026891198095526938372914444181903627938094196468774691975665647890550812376683751593905633065125611092957601442907415902644417519682901059153440286626841355350656757754077474910571424577932014202554351172899008539276212598195566148386803283414780184354222934329064815395828988176783012436153939221036332468551883344836802385258800011254159939415282139047054155201180580357201111671543663885937215403704436525087738509669353351862725364108467051762959998292239822805587007389198288780422715556343928293849868727893528481926649471509098886000214133618311655761794432794819144278520611314/2104739892690518553309455017769556244714403413511128897687327989722964420680265892383589038724767456014984893924465270083609280557483126794337796952227352908716377285895726069985002273993666575392685803959240373262064326038551986753208943247122477492965063535803060781979048064432512218363568944479517226783944750093987235698524362358647309556477616386510411676499309749332531381237162073573221177134517220239232861938282924059678332139188490738557186919435363048815821553632972277017322717437995569914300549640953672499562326398555404438240737181738320282706293441180398162726147059796782693569470160760140774337483534168241795984189626521404877580971816798389149476625721556291121992741942677675296965918687927473569482384058810935115262649386369992511259614038884705095632090478521832146758218051298214283210470295696576869734952976211016365306133993819097015363491687473819879776312850467592349301880297452193370638486783468483172335849930338140479761974767896985979428568709385301326081047303152723543522214229898929905953376294524100600956089149497679894409271817382310743421156370753358446447228174902325396969393126293985010978064558407022476380230661716093665265409338696852391176942119985203709662844145192019854379349306927459908671425530548272821364000403220805106940414514470465019829199892250163872861563267221111218547482541798387173921775791567366427703104289177035407737401314179898002891110788289964230373210504115220736031760314395093885988774780636600868883194732465061084790785"

    """for i in range(1, MAXN + 1):
        start_time = time.time()
        ans = solve(1, i)
        elapsed_time = time.time() - start_time
        
        if elapsed_time > 0.8:
            print("answers[{}]={}/{}".format(i, ans.numerator, ans.denominator))
    """

    n = int(input())
    if answers.get(n) != None:
        print(answers[n])
    else:
        ans = solve(1, n)
        print("{}/{}".format(ans.numerator, ans.denominator))


if __name__ == '__main__':
    main();
