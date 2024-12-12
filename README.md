
		

	
《Java企业级应用开发》大作业报告

题目：员工信息管理系统的设计与实现
（修改成自己的题目，括号内写完删掉）




系    别：                      
专    业：                      
学    号：                      
姓    名：                      
指导老师：                      
报告日期：        年    月    



1 大作业简介
（对大作业题目做一个概括介绍，写完删除该说明性文字）


2 相关技术
（把项目用到的技术模仿下面做一个简介，写完删除该部分）
2.1 Spring Boot
Spring Boot是由Pivotal团队开发的一个开源框架，旨在简化基于Spring的应用程序的初始搭建以及开发过程。它使用了“约定优于配置”的原则，减少了开发者的配置工作量，使得开发者可以更加专注于业务逻辑的实现。Spring Boot的核心功能包括自动配置、独立运行、简化部署、提供生产级别的监控等。它还提供了丰富的组件，如Spring MVC、Spring Data、Spring Security等，能够满足各种开发需求。
Spring Boot框架也能显著提升系统的开发效率，轻松搭建后端服务器，支持Web服务的提供，并有效管理业务逻辑与数据处理。同时，Spring Boot 框架能提供默认的配置和快速的开发环境，方便构建与部署微服务，使得应用程序更加模块化与可扩展。
基于Spring Boot的各种优势，以及在项目中合理使用Spring Boot，可以更快实现系统的设计。











3 需求分析
（程序模块划分合理、功能描述准确，各功能模块的调用关系清晰。用完删除）
需求分析是设计系统过程中至关重要的一环，它有助于明确项目的目标和范围，确保开发团队与客户对项目的期望一致。
设计系统是组织内各种设计元素和规则的集合，用于提高设计效率和一致性。在设计系统之前，进行深入的需求分析至关重要。这一步骤有助于明确设计系统的目标、用户和业务需求，确保构建过程具有明确的方向和价值。此外，需求分析还有助于识别潜在问题和挑战，使我们能够提前制定应对策略。
3.1 可行性分析
3.1.1技术可行性
基于Spring Boot的高校固定资产管理系统的技术可行性是非常高的。Spring Boot是一个开源的Java框架，它提供了快速构建和部署应用程序的能力，同时也提供了丰富的功能和组件，使得开发者可以轻松地构建可靠、高效的应用系统。
Spring Boot框架能够根据项目中添加的依赖自动配置Spring应用，大大减少了开发者的配置工作。开发者只需要添加必要的依赖，Spring Boot就会自动完成相应的配置。
Spring Boot框架可以独立运行，无需部署到应用服务器上。开发者只需要打包成jar包，就可以在任何地方运行Spring Boot应用。
Spring Boot框架提供了多种部署方式，如直接运行、打包成jar包、集成到容器中等，大大降低了部署的复杂性。
Spring Boot拥有大量插件和第三方库，能够集成各种功能，例如数据库连接、缓存技术和消息传递。
Spring Boot框架有着活跃的社区支持，遇到问题时可以快速找到解决方案，这对于快速开发和问题解决非常有帮助。
3.1.2经济可行性
（1）成本分析：首先，采用开源技术栈，可以降低开发成本。其次，Spring Boot具有较高的稳定性，降低运维成本。再者，人工培训成本低，系统简单易上手，不需要进行复杂的培训。而且系统上线后，也可减少工作量，不仅节约了时间的，也降低了人力成本。     
（2）收益分析：通过自动化、信息化的管理手段，可以实现资产的实时更新、查询、统计等功能，提高了资产管理的效率。其次，可以减少手工录入错误，有效降低资产流失的风险，确保资产安全。再者，可以促进资产的合理调配，提高资产的利用率。最后，其也可以促进系统集成，与其他高校资产管理并行，实现信息共享。
综上所述，基于Spring Boot的高校固定资产管理系统有较高的经济可行性，高校可根据自身的需求，应用该系统，可以优化固定资产的管理。
3.1.3操作可行性
（1）易用性：基于Spring Boot的高校固定资产管理系统具有简洁的代码结构，易于维护。
（2）可扩展性：Spring Boot具有较高的可扩展性，方便后期根据高校需求进行功能升级与优化。
（3）安全性：系统十分安全，具有账号加密、权限管理等设计，使得数据稳定。
（4）稳定性：Spring Boot具备良好的稳定性，能够在高并发、大数据量的情况下稳定运行。
3.2 功能性需求
软件的功能需求是开发者必须嵌入产品的具体功能，通过它们用户能执行任务并满足业务需求。
该系统是一个高校固定资产管理系统，它包含了前台界面资产的展示和后台界面资产的管理。使用者分为普通用户和管理员两种，普通用户可以登录注册，进入界面查看资产，具有少量权限，也可以通过管理员新增，管理员可以添加成员，管理员对普通用户和资产进行管理。
3.2.1用户
员工用户作为系统主要成员之一，在系统中承担重要的角色，对系统的正常运行有重要作用，其主要进入系统前台页面，具有注册，登录，个人信息查看，资产信息查看，资产申报等功能，如用户用例图3-1所示。

图3-1 员工用户用例图
3.2.2管理员
管理员是系统的主要管理者，其主要进入后台页面，拥有登录、用户管理、资产分类、转移、维修、停用、折旧、报废、申购、借还、盘点、轮播图管理等功能，如下图 3-2 所示。

图3-2 管理员角色用例图
（1）员工用户管理功能	
管理员可以使用该功能，根据用户姓名检索用户，可以查看用户账号，姓名，性别，手机号码，邮箱，头像等信息，可以对用户进行增加和删除操作。
（2）资产分类功能
点击资产分类管理，进行资产分类，后续进入系统的可以进行资产分类，也可以进行资产分类的增加和删除操作。
（3）资产转移功能
点击资产转移管理，进行资产转移，通过资产编码或名称进行检索，除了展示资产编码、名称、分类等信息，也可以进行资产转入转出，确定资产转入转出部门和资产转移时间，可以点击详情，查看详细情况和转移说明，点击修改删除可以修改删除记录。
（4）资产停用功能
点击资产停用管理，进行资产停用，通过资产编码或名称进行检索，该功能除了展示资产编码、名称、分类等信息，也可以查看资产停用数量和停用日期，可以点击详情，查看详细情况和停用说明，点击修改或删除可以修改或删除记录。
（5）资产维修管理
点击资产维修管理，进行资产维修管理，通过资产编码或名称进行检索，该功能除了展示资产编码、名称、分类等信息，也可以查看资产保修天数数量、维修价格和维修日期，可以点击详情，查看详细情况和维修说明，点击修改或删除可以修改或删除记录。
（6）资产折旧管理
点击资产折旧管理，进行资产折旧管理，通过资产编码或名称进行检索，该功能除了展示资产编码，名称等信息，也可以查看资产原值、每月折旧、累计折旧和资产残值，可以点击详情，查看详细情况，点击修改或删除可以修改或删除记录。
（7）资产申购管理
点击资产申购管理，进行资产申购管理，通过资产名称进行检索，该功能除了展示资产编码、名称等信息，也可以查看资产购买时间、申购人的账号和姓名以及审核回复状态，可以点击详情，查看详细情况，点击修改或删除可以修改或删除记录。
（8）资产报废管理
点击资产报废管理，进行资产报废管理，通过资产编码或名称进行检索，该功能除了展示资产编码、名称、分类等信息，也可以查看资产价值和数量、申购人的账号以及报废日期，另外还可以批量统计报废数量，最后可以点击详情，查看详细情况和报废说明，点击修改或删除可以修改或删除记录。
（9）资产借还管理
点击资产借还管理，进行资产借还管理，通过资产编码或名称进行检索，该功能除了展示资产编码、名称、分类、价值等信息，也可以查看借出或归还地点和日期，也可以点击详情，查看详细情况和借还情况，点击修改或删除可以修改或删除记录。
（10）资产盘点管理
点击资盘点管理，进行资产盘点管理，通过资产编码、名称和分类进行检索，该功能除了展示资产编码、名称、分类、原值、残值等信息，也可以查看存放地点和登记日期，也可以点击详情，查看详细情况，点击修改或删除可以修改或删除记录。
3.2.3用例描述
（1）用户
用户角色的功能模块涵盖用户注册、登录、个人信息查看，资产信息查看等方面。 
以下是用户注册的用例描述，如表3- 1所示。
表 3- 1  用户注册用例描述

用例编号	101
用例名称	用户注册
参与者	用户
简要说明	用户在网站首页进行注册
前置条件	用户点击首页的注册登录按钮
续表 3-1 用户注册用例描述
用例编号	101
基本事件流	（1）用户点击进入高校固定资产管理前台首页
（2）点击用户注册按钮
（3）填入用户账户、密码、姓名、手机、邮箱
（4）点击注册
（5）用例结束
后置条件	用户注册账号成功
备注	无
用户进行登录的用例描述，如表3-2所示。
表3-2 用户登录用例描述

用例编号	102
用例名称	用户登录系统
参与者	用户
简要说明	用户使用已注册账号登录系统
前置条件	用户已在该系统注册账号
基本事件流	（1）用户进入首页，跳转用户登录页面
（2）输入账号、密码
（3）点击用户，确认登录
（4）用例终止
后置条件	用户信息录入系统
备注	无
用户进行个人信息查看更新的用例描述，如表 3-3所示。
表3-3 用户查看个人信息用例描述

用例编号	103
用例名称	用户查看更新个人信息
参与者	用户
简要说明	用户登录首页查看更新个人信息
前置条件	用户已经登录系统
基本事件流	（1）点击首页个人信息
（2）跳转到个人信息页面
（3）更新个人信息
（4）点击“更新信息”按钮
（5）更新成功，用例终止
续表3-3用户查看个人信息用例描述
用例编号	103
后置条件	更新成功，系统内用户个人信息修改成功
备注	无

用户进行资产信息查看的用例描述，如表 3-4所示。
表3-4 用户查看资产信息用例描述

用例编号	104
用例名称	用户查看资产信息
参与者	用户
简要说明	用户登录首页查看资产信息
前置条件	用户已经登录系统
基本事件流	（1）点击首页固定资产信息
（2）跳转到资产信息页面
（3）点击对应资产图片，跳转
（4）显示资产具体信息
（5）用例终止
后置条件	查看成功
备注	无
用户进行资产申报的用例描述，如表 3-5所示。
表3-5 用户资产申报用例描述

用例编号	105
用例名称	用户进行资产申报
参与者	用户
简要说明	用户登录后台页面
前置条件	用户已经登录系统
基本事件流	（1）点击后台管理
（2）跳转到资产信息页面
（3）点击对应资产上报
（4）填写申请内容
（5）用例终止
后置条件	申报成功，申报信息录入系统，管理员可以查看申报内容
备注	无
（2）管理员
管理员主要进行资产分类、资产转移、资产停用、资产维修、资产折旧、资产申购、报废、资产借还、资产盘点等，以下为管理员功能模块用例描述详情。
管理员进行资产分类的用例描述，如表 3-6所示。
表 3-6 资产分类用例描述

用例编号	106
用例名称	资产分类
参与者	管理员
简要说明	管理员进行资产分类
前置条件	管理员已经登录高校固定资产管理系统
基本事件流	（1）点击左侧“资产分类管理”导航栏
（2）点击资产分类按钮
（3）点击对应按钮，进行资产分类增删改查
（4）点击提交保存
（5）页面弹出更新的分类信息
（6）用例终止
后置条件	资产分类更新信息进入系统中
备注	无
管理员进行资产转移的用例描述，如表 3-7所示。
表 3-7 资产转移用例描述

用例编号	107
用例名称	资产转移
参与者	管理员
简要说明	管理员进行资产转移
前置条件	管理员已经登录高校固定资产管理系统
基本事件流	（1）点击左侧“资产转移管理”导航栏
（2）点击资产转移按钮
（3）点击对应按钮，进行资产转移增删改查
（4）点击提交保存
（5）页面弹出新的转移信息
（6）用例终止
后置条件	资产转移信息进入系统中
备注	无
管理员进行资产停用的用例描述，如表 3-8所示。
表 3-8 资产停用用例描述

用例编号	108
用例名称	资产停用
参与者	管理员
简要说明	管理员进行资产停用
前置条件	管理员已经登录高校固定资产管理系统
基本事件流	（1）点击左侧“资产停用管理”导航栏
（2）点击资产停用按钮
（3）点击对应按钮，进行资产停用增删改查
（4）点击提交保存
（5）页面弹出新的停用信息
（6）用例终止
后置条件	资产停用信息进入系统中
备注	无
管理员进行资产维修的用例描述，如表 3-9所示。
表 3-9 资产维修用例描述

用例编号	109
用例名称	资产维修
参与者	管理员
简要说明	管理员进行资产维修
前置条件	管理员已经登录高校固定资产管理系统
基本事件流	（1）点击左侧“资产维修管理”导航栏
（2）点击资产维修按钮
（3）点击对应按钮，进行资产维修增删改查
（4）点击提交保存
（5）页面弹出新的维修信息
（6）用例终止
后置条件	资产维修信息进入系统中
备注	无
管理员进行资产折旧的用例描述，如表 3-10所示。
表 3-10 资产折旧用例描述

用例编号	110
用例名称	资产折旧
参与者	管理员
简要说明	管理员进行资产折旧
前置条件	管理员已经登录高校固定资产管理系统
基本事件流	（1）点击左侧“资产折旧管理”导航栏
（2）点击资产折旧按钮
（3）点击对应按钮，进行资产折旧增删改查
（4）点击提交保存
（5）页面弹出新的折旧信息
（6）用例终止
后置条件	资产折旧信息进入系统中
备注	无
管理员进行资产申购的用例描述，如表 3-11所示。
表 3-11 资产申购用例描述

用例编号	111
用例名称	资产申购
参与者	管理员
简要说明	管理员进行资产申购
前置条件	管理员已经登录高校固定资产管理系统
基本事件流	（1）点击左侧“资产申购管理”导航栏
（2）点击资产申购按钮
（3）点击对应按钮，进行资产停用增删改查
（4）点击提交保存
（5）点击审核，进入审核界面
（6）输入审核情况，点击确认
（7）页面弹出新的申购审核信息
（8）用例终止
后置条件	资产申购信息进入系统中
备注	无
管理员进行资产报废的用例描述，如表 3-12所示。
表 3-12 资产报废用例描述

用例编号	112
用例名称	资产报废
参与者	管理员
简要说明	管理员进行资产报废
前置条件	管理员已经登录高校固定资产管理系统
基本事件流	（1）点击左侧“资产报废管理”导航栏
（2）点击资产报废按钮
（3）点击对应按钮，进行资产报废增删改查
（4）点击提交保存
（5）页面弹出新的报废信息
（6）用例终止
后置条件	资产报废信息进入系统中
备注	无
管理员进行资产借还的用例描述，如表 3-13所示。
表 3-13 资产借还用例描述

用例编号	113
用例名称	资产借还
参与者	管理员
简要说明	管理员进行资产借还
前置条件	管理员已经登录高校固定资产管理系统
基本事件流	（1）点击左侧“资产借还管理”导航栏
（2）点击资产借还按钮
（3）点击对应按钮，进行资产借还增删改查
（4）点击提交保存
（5）页面弹出新的借还信息
（6）用例终止
后置条件	资产借还信息进入系统中
备注	无
管理员进行资产盘点的用例描述，如表 3-14所示。
表 3-14 资产盘点用例描述

用例编号	114
用例名称	资产盘点
参与者	管理员
简要说明	管理员进行资产盘点。
前置条件	管理员已经登录高校固定资产管理系统
基本事件流	（1）点击左侧“资产盘点管理”导航栏
（2）点击资产盘点按钮
（3）点击对应按钮，进行资产盘点增删改查
（4）点击提交保存
（5）页面弹出新的盘点信息
（6）用例终止
后置条件	资产盘点信息进入系统中
备注	无
3.3非功能性需求
（1）可靠性：系统确保能够稳定运行，系统安全可以保障。
（2）可用性：系统用户界面良好，简单易用，用户可以快速上手实现对应的功能。
（3）兼容性：系统应能够与现有的固定资产管理系统兼容，数据可以交换和共享。
（4）可维护性：系统应具备良好的可维护性，便于后期升级和维护，同时也可以减少维护成本。
3.4数据字典
（1）用户
用户表侧重用户登录和注册功能的实现。
名字：用户表
别名：用户信息
描述： 在本系统中，用户表是一种用于存储员工用户信息的数据表。
定义：用户表=用户ID+用户账号+用户姓名+密码+性别+手机号码+邮箱+头像。
位置：将用户信息管理传输至后台管理系统，进行各种管理操作。
（2）管理员
管理员表存储管理员信息。

名字：管理员表
别名：管理员信息
描述： 在本系统中，管理员表是用于查看管理员详细信息的数据表。
定义：管理员表=管理员ID+管理员姓名+密码+身份+注册时间。
位置：将管理员信息管理传输至后台，方便管理员查看。
（3）资产分类
资产分类表存储系统中的资产分类信息。
名字：资产分类表
别名：资产分类信息
描述：资产分类表是用于存储系统中的资产分类信息。
定义：资产分类表=分类 ID+分类名称+设置时间。
位置：输出到系统后台，展示固定资产分类列表。
（4）资产转移
资产转移表储存资产转移信息的工具。
名字：资产转移表
别名：资产转移信息
描述： 在本系统中，资产转移表是一种用于存储资产转移信息的数据表，以便确认资产转移的实时情况。
定义：资产转移表=资产ID+资产名称+资产分类+资产价值+转出部门+转入部门+转移时间+转移说明。
位置：输出到后台管理系统进行资产转移管理。
（5）资产停用
资产停用表储存资产停用信息的工具。
名字：资产停用表
别名：资产停用信息
描述：在本系统中，资产停用表是一种用于存储资产停用信息的数据表，以便确认资产停用的实时情况。
定义：资产停用表=资产ID+资产名称+资产分类+停用数量+停用日期+停用说明。
位置：输出到后台管理系统进行资产停用管理。
（6）资产维修
资产维修表储存资产维修信息的工具。
名字：资产维修表
别名：资产维修信息
描述：在本系统中，资产维修表是一种用于存储资产维修信息的数据表，以便确认资产维修的实时情况。
定义：资产维修表=资产ID+资产名称+资产分类+保修天数+维修价格+维修日期+维修说明。
位置：输出到后台管理系统进行资产维修管理。
（7）资产折旧
资产折旧表储存资产折旧信息的工具。
名字：资产折旧表
别名：资产折旧信息
描述：在本系统中，资产折旧表是一种用于存储资产折旧信息的数据表，以便确认资产折旧的实时情况。
定义：资产折旧表=资产ID+资产名称+资产原值+每月折旧+累计折旧+资产残值+折旧说明。
位置：输出到后台管理系统进行资产折旧管理。
（8）资产申购
资产申购表储存资产申购信息的工具。
名字：资产申购表
别名：资产申购信息
描述：在本系统中，资产申购表是一种用于存储资产申购信息的数据表，以便确认资产申购的实时情况。
定义：资产申购表=资产ID+资产名称+资产数量+使用时间+申购人账号+申购姓名+审核回复+审核状态+申请理由。
位置：由员工用户或者管理申请，输出到后台管理系统进行资产申购管理。
（9）资产报废
资产报废表用于存储资产报废信息。
名字：资产报废表
别名：资产报废信息
描述：在本系统中，资产报废表是一种用于存储资产报废信息的数据表，以便确认资产报废的情况。
定义：资产报废表=资产ID+资产名称+资产分类+资产价值+资产数量+报废日期+报废说明。
位置：输出到后台管理系统进行资产报废管理。
（10）资产借还
资产借还表储存资产借还信息的工具。
名字：资产调拨表
别名：资产借还信息
描述：在本系统中，资产借还表是一种用于存储资产借还信息的数据表，以便确认资产借还的实时情况。
定义：资产借还表=资产ID+资产名称+资产分类+资产价值+借出地点+归还地点+借还日期+借还说明。
位置：输出到后台管理系统进行资产借还管理。
（11）资产盘点
资产盘点表储存资产盘点信息的工具。
名字：资产清查表
别名：资产盘点信息
描述：在本系统中，资产盘点表是一种用于存储资产盘点信息的数据表，以便确认资产盘点的实时情况。
定义：资产盘点表=资产ID+资产名称+资产分类+资产价值+资产图片+资产数量+资产原值+资产残值+存放地点+存放日期。
位置：输出到后台管理系统进行资产盘点管理。
（12）固定资产表
固定资产表储存所有固定资产信息的工具。
名字：固定资产表
别名：固定资产信息
描述：在本系统中，固定资产表是一种用于存储所有资产信息的数据表，以便管理资产。
定义：固定资产表=资产ID+资产名称+资产分类+资产图片+资产数量+资产单价+资产总值+购买时间。
位置：输出到前台展示给用户所有固定资产信息，管理员通过后台管理系统进行管理。









4 系统设计
（详细的功能模块、类和数据库的设计，结构非常清晰。写完删除该部分）
4.1 系统架构设计
对于高校固定资产管理系统进行整体功能分析之后，可以设计出该系统的功能模块图如图4-1所示。

图4–1 系统功能模块图	
4.2 数据库设计
4.2.1数据库设计概述
现如今，数据库技术已成为企业信息化建设的重要组成部分。MySQL,作为一种开放源代码的关系型数据库管理系统，因其卓越性能、稳定性及功能丰富而受到众多开发者和企业的青睐。
MySQL数据库不仅有很高的性能，其还具有独特的存储引擎和优化的查询算法。MySQL支持事务处理，在多用户同时访问时其也保证了数据的准确性。在企业级开发中，MySQL凭借其优秀的性能，成为了数据管理的首选。MySQL具有简洁直观的语法，易于学习和使用。
4.2.2概念设计
（1）用户实体
用户表里边的属性有主键，账号，手机，姓名，性别，邮箱，用户表的实体属性图4-2所示。

图4–2 用户实体属性图
（2）资产分类实体
资产分类表里存的属性有主键，分类名。分类的实体属性图如图4-3所示。

图4–3 用户实体属性图
（3）资产折旧实体
资产报废实体的一些基本信息属性包含主键，资产编码，资产名称，资产原值，资产残值，每月折旧，累计折旧等，实体属性图如图4-4所示。

图4–4 资产折旧实体属性图
（4）资产申购实体
资产申购表实体的一些基本信息属性包括：主键，资产编号，资产名称，资产数量，使用时间，账号，姓名，申请理由，审核状态实体属性图如图4-5所示。

图4–5 资产申购表实体属性图
（5）资产转移实体
资产转移表实体的一些基本信息属性包括：主键，资产编码，资产名称，资产分类，资产价值，转出部门，转入部分，转移日期。实体属性图如图4-6所示。

图4–6 资产转移实体属性图
（6）资产维修实体
资产维修表实体的一些基本信息属性包括：主键，资产编码，资产名称，资产分类，保修天数，维修价格，维修日期，维修说明等。实体属性图如图4-7所示。

图4–7 资产维修实体属性图
（7）资产报废实体
资产报废表实体的一些基本信息属性包括：主键，资产编码，资产名称，资产分类，资产价值，资产数量，报废日期，报废说明等，实体属性图如图4-8所示。

图4–8 资产报废实体属性图
（8）资产借还实体
资产借还表实体的一些基本属性包括：主键，资产编码，资产名称，资产分类，资产价值，借出地点，归还地点，归还时间，归还日期，借还说明等，实体属性图如图4-9所示。

图4–9 资产借还实体属性图
（9）资产停用实体
资产停用表实体的一些基本属性包括：主键，资产编码，资产名称，资产分类，停用数量，停用日期，停用说明等，实体属性图如图4-10所示。

图4–10 资产停用实体属性图
（10）资产盘点实体
资产盘点表实体的一些基本属性包括：主键，资产编码，资产名称，资产分类，资产图片，资产原值，资产残值，存放地点，存放日期等，实体属性图如图4-11所示。

图4–11 资产盘点实体属性图
（11）管理员实体
管理员表实体的一些基本属性包括：主键，管理员姓名，密码，身份，实体属性图如图4-12所示。

图4–12 管理员实体属性图
E-R图，可以更直观的告诉系统中的各个属性关系，各个数据之间的联系，通过该模型更直观的了解数据库设计，并逐渐进行改善。管理员实体属性包括逐渐，姓名，密码，等实体属性，其可以对系统中的用户管理和具体管理，具体管理包括资产分类、资产转移、资产申购、资产报废、资产维修、资产借还、资产停用、资产盘点等各个功能模块进行管理，而用户主键主键，账号，手机，姓名，性别，邮箱等实体属性，其属于用户信息，用户在对应的功能模块中申请转移、停用、维修、停用、申购、借还等进行申报，申报后管理员可以查看固定资产的申报情况，具体E-R图如图4-13所示。

图 4-13 系统整体E-R图

4.2.3数据表设计
根据 E-R图的实体在数据库中可建立12个表，分别为：员工用户表、管理员表、资产分类表、资产转移表、资产停用表、资产维修表、资产折旧表、资产申购表、资产报废表、资产借还表、资产盘点表、固定资产表。
（1）员工用户表（yuangong）
用户表如图4- 1所示。
表4- 1 用户表
列名	数据类型	长度	备注	字段说明
Id	bigint	11	主键	主键
Addtime	datetime	8		注册时间
Zhanghao	varchar	200		账号
Mima	varchar	200		密码
Xingbie	varchar	10		性别
Shouji	varchar	200		手机
Youxiang	varchar	200		邮箱
Touxiang	varchar	200		头像
（2）管理员表（users）
管理员表如图4-2所示。
表4–2 管理员表
列名	数据类型	长度	备注	字段说明
Id	bigint	20	主键	主键
Addtime	datetime	8		注册时间
Username	varchar	100		管理员姓名
Password	varchar	100		密码
Role	varchar	100		身份
（3）资产分类表（zichanfenlei）
资产分类表如图4-3所示。
表4–3 资产分类表
列名	数据类型	长度	备注	字段说明
Id	bigint	20	主键	主键
Addtime	datetime	8		注册时间
Fenlei	varchar	200		资产分类
（4）资产转移表（zichanzhuanyi）
资产转移表如图4-4所示。
表4–4 资产转移表
列名	数据类型	长度	备注	字段说明
Id	bigint	20	主键	主键
addtime	datetime	8		注册时间
Zichanbianma	varchar	200		资产编码
Zichanmingcheng	varchar	200		资产名称
Zichanfenlei	varchar	200		资产分类
Zichanjiazhi	int	11		资产价值
Zhuanchubumen	varchar	200		转出部门
Zhuanrubumen	varchar	200		转入部门
Zhuanyiriqi	varchar	200		转移日期
Zhuanyineirong	varchar	200		转移内容
（5）资产停用表（zichanzhuanyi）
资产停用表如图4-5所示。
表4–5 资产停用表
列名	数据类型	长度	备注	字段说明
Id	bigint	20	主键	主键
addtime	datetime	8		注册时间
Zichanbianma	varchar	200		资产编码
Zichanmingcheng	varchar	200		资产名称
Zichanfenlei	varchar	200		资产分类
Tingyongshuliang	int	11		停用数量
Tingyongriqi	datetime	8		停用日期
Tingyongshuoming	varchar	200		停用说明
（6）资产维修表（zichanweixiu）
资产维修表如图4-6所示。
表4–6 资产维修表
列名	数据类型	长度	备注	字段说明
Id	bigint	20	主键	主键
addtime	datetime	8		注册时间
Zichanbianma	varchar	200		资产编码
Zichanmingcheng	varchar	200		资产名称
Zichanfenlei	varchar	200		资产分类
Baoxiutianshu	int	11		报废数量
Weiuxiujiage	int	11		维修价格
Weixiuriqi	datetime	8		维修日期
Weixiushuoming	varchar	200		维修说明
（7）资产折旧表（zichanzhejiu）
资产折旧表如图4-7所示。
表4–7资产折旧表
列名	数据类型	长度	备注	字段说明
Id	bigint	20	主键	主键
addtime	datetime	8		注册时间
Zichanbianma	varchar	200		资产编码
Zichanmingcheng	varchar	200		资产名称
Zichanyuanzhi	int	11		资产原值
Meiyuezhejiu	int	11		每月折旧
Leijizhejiu	int	11		累计折旧
Zichancanzhi	int	11		资产残值
（8）资产申购表（zichanshengou）
资产申购表如图4-8所示。
表4–8 资产申购表
列名	数据类型	长度	备注	字段说明
Id	bigint	20	主键	主键
addtime	datetime	8		注册时间
Zichanbianma	varchar	200		资产编码
Zichanmingcheng	varchar	200		资产名称
Zichanyuanzhi	int	11		资产原值
Shenqingliyou	varchar	200		申请理由
Zichanshuliang	int	11		资产数量
Shiyongshijian	datetime	8		使用时间
Zhanghao	varchar	200		账号
Xingming	varchar	200		姓名
Sfsh	varchar	200		是否审核
Shhf	varchar	200		审核回复
（9）资产报废表（zichanbaofei）
资产报废表如图4-9所示。
表4–9 资产报废表
列名	数据类型	长度	备注	字段说明
Id	bigint	20	主键	主键
addtime	datetime	8		注册时间
Zichanbianma	varchar	200		资产编码
Zichanmingcheng	varchar	200		资产名称
Zichanfeilei	varchar	200		资产分类
Zcihanjiazhi	int	11		资产价值
Zichanshuliang	int	11		资产数量
Baofeiriqi	datetime	8		报废日期
Baofeishuoming	varchar	200		报废说明
（10）资产借还表（zichandiaobo）
资产借还表如图4-10所示。
表4–10 资产借还表
列名	数据类型	长度	备注	字段说明
Id	bigint	20	主键	主键
addtime	datetime	8		注册时间
Zichanbianma	varchar	200		资产编码
Zichanmingcheng	varchar	200		资产名称
Zichanfeilei	varchar	200		资产分类
Zcihanjiazhi	int	11		资产价值
Diaochudidian	varchar	200		借出地点
Diaorudidian	varchar	200		借入地点
Diaoboriqi	datetime	8		借用日期
Diaoboneirong	varchar	200		借用内容
（11）资产盘点表（zichanqingcha）
资产盘点表如图4-11所示。
表4–11 资产盘点表
列名	数据类型	长度	备注	字段说明
Id	bigint	20	主键	主键
addtime	datetime	8		注册时间
Zichanbianma	varchar	200		资产编码
Zichanmingcheng	varchar	200		资产名称
Zichanfeilei	varchar	200		资产分类
Zcihanshuliang	int	11		资产数量
Zichantupian	varchar	200		资产图片
Zichanyuanzhi	int	11		资产原值
Zichancanzhi	int	11		资产残值
Cunfangdidian	varchar	200		存放地点
Dengjiriqi	datetime	8		登记日期
（12）固定资产表（gudingzichan）
固定资产表如图 4-12所示。
表4–12 固定资产表
列名	数据类型	长度	备注	字段说明
Id	bigint	20	主键	主键
addtime	datetime	8		注册时间
Zichanbianma	varchar	200		资产编码
Zichanmingcheng	varchar	200		资产名称
Zichanfeilei	varchar	200		资产分类
Zcihanshuliang	int	11		资产数量
Zichantupian	varchar	200		资产图片
Zichandanjia	int	11		资产单价
Zichanzongjia	int	11		资产总价
Goumaishijian	datetime	8		购买时间
4.3详细设计
根据以上功能模块的划分，下面是高校固定资产管理系统的部分流程图，包含各个子模块的流程图设计。
4.2.4用户模块
(1) 用户注册
该功能进行用户注册。新用户进入系统中首先进行注册，注册成功后可以进入系统。用户进行注册操作，如图 4-13所示。

图4–13用户注册流程图
（2）用户登录
用户注册后，信息进入系统，输入已注册用户可以进入系统，如图4- 14所示.

.图 4- 14 用户登录模块
（3）用户查看资产信息
用户登录系统后，可以点击对应功能，输入资产的编码或者名称搜索查看资产详细信息，如图4- 15所示

图 4- 15用户查看资产信息模块
（4）用户进行资产申报
用户登录系统后，进入后台可以点击对应功能，输入资产的编码或者名称搜索查看资产详细信息，进行相关操作如图4- 16所示.

.图 4- 16 用户资产申报模块
4.2.5管理员模块
管理员登录管理平台，进入后台页面，选择资产分类、转移、维修、停用、折旧、报废、申购、借还、盘点、轮播图管理等功能，，在搜索框里边进行输入所要查询的资产相关信息，之后可以点击详情查看固定资产的详细信息，具体流程图如图4-17所示。

图4–17 管理员查询资产流程图
5 系统实现
（程序运行稳定且正确，功能全。程序结构清晰，代码规范。用完删除）
5.1 工具使用
(1)框架设置Spring Boot
核心依赖：Spring Boot框架的核心依赖，包括Spring Web和Spring Data JPA等。 
数据库连接：通过Spring Data JPA连接MySQL数据库，实现对固定资产数据的持久化。
服务层：使用Spring的@Service注解定义服务层组件，处理业务逻辑。
控制器层：使用Spring的@RestController或@Controller注解定义控制器，处理HTTP请求。
启动类：定义主应用程序类，使用@SpringBootApplication注解启动Spring Boot应用。
(2)数据处理工具类实现
数据转换：定义工具类，用于将数据从一种格式转换为另一种格式，如将JSON转换为Java对象。
数据验证：实现数据验证逻辑，确保数据的合法性和一致性。
(3)文件处理工具类
文件上传：实现文件上传功能，通常使用Spring Boot的MultipartFile处理文件上传。
文件下载：实现文件下载功能，通过ResponseBody将文件作为响应发送给客户端。
以上是基于Spring Boot的高校固定资产管理系统中框架设置和工具类实现的一些基本思路。在实际开发中，需要根据具体的需求进行设计。
5.2 用户核心功能模块的实现
5.2.1前台页面
前台是高校固定资产管理系统面向用户的页面，展示系统中的固定资产等信息。在实现首页时，需要设计合理的页面布局，突出系统中的重点内容；选择合适的图片、字体和颜色等元素， 用来增强用户体验；采用响应式设计，适应不同屏幕大小。以下是前台页面的实现，如图 5-1所示。

图5-1 前台实现图
这段代码实现了首页的轮播图、固定资产展示、个人信息查看、跳转到后台等功能。首先， 通过RequestMapping 注解映射到 index.action请求， 调用 front()方法来设置前台页面的。通过调用多个Service层方法，获取资产信息，个人信息并处理数据，并将其设置到 request请求中， 最终通过视图模板展示在页面上，其核心代码如下：

public String index1211()
{
this.front();
List<Baner> bannerList = this.bannerService.getAllBanner();
List<Banner> frontList = new ArrayList<Banner>();
for (Banner banner : bannerList)
{
List<Article> artiList = this.artiService.getArtByBanner(banner.getBannerid()); banner.setArticleList(articleList);
frontList.add(banner);
}
this.getRequest().setAttribute("froList", froList);
List<Article> topList = this.articleService.getTopArti();
List<Article> favList = this.articleService.getFlvArti();
this.getRequest().setAttribute("topList", topList);
this.getRequest().setAttribute("faL", faLt);
return "usersss/index12";
}
5.2.2用户注册
用户注册是实现的是一个新用户首次登录系统创建自己账号的功能，用户需要填写自己账号，密码，性别，手机，邮箱等信息，其功能实现如图5-2所示。

图5-2 用户注册实现图
这段代码实现的是用户新增是普通用户在第一次访问网站时需要注册，这种注册就会新增数据库中的用户。在RegisterController中，采用Spring的IOC（控制反转）特性，注入UserService实例。然后，该实例的add方法被调用，以向用户表中插入特定属性。注册时会判断用户是否已经存在。
@RestController
@RequestMapping("/yuangong")
public class YuangongController {
    @Autowired
    private YuangongService yuangongService;  
    @Autowired
    private TokenService tokenService;
    /**
     * 登录
     */
    @IgnoreAuth
    @RequestMapping(value = "/login")
    public R login(String username, String password, String captcha, HttpServletRequest request) {
       YuangongEntity user = yuangongService.selectOne(new EntityWrapper<YuangongEntity>().eq("zhanghao", username));
       if(user==null || !user.getMima().equals(password)) {
          return R.error("账号或密码不正确");
       }  
       String token = tokenService.generateToken(user.getId(), username,"yuangong",  "管理员" );
       return R.ok().put("token", token);
    }  
   
    @IgnoreAuth
    @RequestMapping("/register")
    public R register(@RequestBody YuangongEntity yuangong){
        //ValidatorUtils.validateEntity(yuangong);
        YuangongEntity user = yuangongService.selectOne(new EntityWrapper<YuangongEntity>().eq("zhanghao", yuangong.getZhanghao()));
       if(user!=null) {
          return R.error("注册用户已存在");
       }
       Long uId = new Date().getTime();
       yuangong.setId(uId);
        yuangongService.insert(yuangong);
        return R.ok();
    }   
5.2.3用户登录
用户登录系统后，才能使用相关功能。以下是用户模块中用户登录操作，如图5-3所示。

图5-3 用户登录实现图
该模块核心代码如下：

Public interface YuangongService extends IService<YuangongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
    List<YuangongVO> selectListVO(Wrapper<YuangongEntity> wrapper);
    
    YuangongVO selectVO(@Param("ew") Wrapper<YuangongEntity> wrapper);
    
    List<YuangongView> selectListView(Wrapper<YuangongEntity> wrapper);
    
    YuangongView selectView(@Param("ew") Wrapper<YuangongEntity> wrapper);
    
    PageUtils queryPage(Map<String, Object> params,Wrapper<YuangongEntity> wrapper);
    
}
5.2.4用户查看个人信息
用户进入系统后可以查看个人信息，其实现如下，如图5-4所示。

图 5-4个人信息查看实现图
5.2.5资产信息查看
用户进入系统可以输入资产查询的条件，查看资产信息，如图5-5所示。

图5-5 资产信息查看实现图
其核心代码如下：
 /**
    * 前端列表
    */
   @RequestMapping("/list")
   public R list(@RequestParam Map<String, Object> params,ZichanqingchaEntity zichanqingcha, HttpServletRequest request){
       EntityWrapper<ZichanqingchaEntity> ew = new EntityWrapper<ZichanqingchaEntity>();
    PageUtils page = zichanqingchaService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zichanqingcha), params), params));
       return R.ok().put("data", page);
   }
/**
    * 列表
    */
   @RequestMapping("/lists")
   public R list( ZichanqingchaEntity zichanqingcha){
        EntityWrapper<ZichanqingchaEntity> ew = new EntityWrapper<ZichanqingchaEntity>();
        ew.allEq(MPUtil.allEQMapPre( zichanqingcha, "zichanqingcha")); 
       return R.ok().put("data", zichanqingchaService.selectListView(ew));
   }
5.2.6资产申报
用户可以进入后台进行资产申报，其功能如图5-6所示。

图5-6资产申报实现图
其核心代码如下：
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ZichanshengouEntity zichanshengou, HttpServletRequest request){
        EntityWrapper<ZichanshengouEntity> ew = new EntityWrapper<ZichanshengouEntity>();
       PageUtils page = zichanshengouService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zichanshengou), params), params));
        return R.ok().put("data", page);
    }

    /**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ZichanshengouEntity zichanshengou){
        EntityWrapper<ZichanshengouEntity> ew = new EntityWrapper<ZichanshengouEntity>();
        ew.allEq(MPUtil.allEQMapPre( zichanshengou, "zichanshengou")); 
        return R.ok().put("data", zichanshengouService.selectListView(ew));
    }
5.3 管理员核心功能模块的实现
5.3.1用户管理模块
（1）根据用户名称查询用户
该模块实现的功能是根据用户名来查找用户信息。管理员登录后台管理系统，单击用户管理，进入用户管理页面，输入用户名称查询用户，系统会向用户展示所搜索到的用户，根据航班号查询航班模块的效果图如图5-7所示。


图5–7 查询用户效果图
（2）删除用户信息
该模块负责执行用户信息的删除操作，通过UserController类利用Spring的依赖注入特性引入UserService服务，进而调用其中的update方法，依据从前端获取的用户ID来执行删除动作。实现该模块的核心代码如下：
@RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        userService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
删除用户信息模块的效果图如图5-8所示。

图5-8 删除用户效果图
（3）修改用户信息
该模块是允许用户更新他们的个人信息，在架构上，它是通过Spring框架的依赖注入机制将UserService类注入到UserController中。当用户在前端界面输入要更新的信息后，会通过一个ID来指明需要修改哪位用户的数据。在UserController中，会调用UserService的update方法来执行实际的更新操作。实现该模块的核心代码如下。
@RequestMapping("/update")
public R update(@RequestBody YuangongEntity yuangong, HttpServletRequest request){
    //ValidatorUtils.validateEntity(yuangong);
    yuangongService.updateById(yuangong);//全部更新
    return R.ok();
}
修改用户信息模块的效果图如图5-9所示。

图5-9 修改用户信息图
5.3.2资产分类管理
该模块实现的是资产分类管理，进行资产分类，通过分类名称进行检索，其具体效果图如图5-10，5-11所示：

图5–10 资产分类操作图

图5–11 资产分类成功图
该模块实现的是资产盘点管理，在ZichanfenleiController中通过Spring的IOC机制注入ZichanfenleiService，调用其中的interface获取资产信息，然后想详细信息返回给后台。在页面上进行展示。调用的是controller中的方法。其核心代码如下：
/**
 * 资产分类
 * 后端接口
 * @author 
 * @email 
 * @date 2024-05-14 
 */
@RestController
@RequestMapping("/zichanfenlei")
public class ZichanfenleiController {
    @Autowired
    private ZichanfenleiService zichanfenleiService;
    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ZichanfenleiEntity zichanfenlei,
       HttpServletRequest request){
        EntityWrapper<ZichanfenleiEntity> ew = new EntityWrapper<ZichanfenleiEntity>();
       PageUtils page = zichanfenleiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zichanfenlei), params), params));

        return R.ok().put("data", page);
    }
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ZichanfenleiEntity zichanfenlei, HttpServletRequest request){
        EntityWrapper<ZichanfenleiEntity> ew = new EntityWrapper<ZichanfenleiEntity>();
       PageUtils page = zichanfenleiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zichanfenlei), params), params));
        return R.ok().put("data", page);
    }
    /**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ZichanfenleiEntity zichanfenlei){
        EntityWrapper<ZichanfenleiEntity> ew = new EntityWrapper<ZichanfenleiEntity>();
        ew.allEq(MPUtil.allEQMapPre( zichanfenlei, "zichanfenlei")); 
        return R.ok().put("data", zichanfenleiService.selectListView(ew));
    }
5.3.3资产转移管理
该模块实现的是资产转移管理，进行资产转移，通过资产编码或名称进行检索，除了展示资产编码、名称、分类等信息，也可以进行资产转入转出，确定资产转入转出部门和资产转移时间，可以点击详情，查看详细情况和转移说明，点击修改删除可以修改。
资产转移模块的具体效果图如图5-12，5-13所示：

图5–12资产转移操作图

图5–13 资产转移成功效果图
该模块实现的是资产盘点管理，在ZichanzhuanyiController中通过Spring的IOC机制注入ZichanzhuanyiService，调用其中的interface获取资产信息，然后想详细信息返回给后台。在页面上进行展示。调用的是controller中的方法。其核心代码如下：
@RequestMapping("/zichanzhuanyi")
public class ZichanzhuanyiController {
    @Autowired
    private ZichanzhuanyiService zichanzhuanyiService;
    /** 后端列表 **/
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ZichanzhuanyiEntity zichanzhuanyi,
       HttpServletRequest request){
        EntityWrapper<ZichanzhuanyiEntity> ew = new EntityWrapper<ZichanzhuanyiEntity>();
       PageUtils page = zichanzhuanyiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zichanzhuanyi), params), params));
        return R.ok().put("data", page);
    }
    /** 前端列表 **/
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ZichanzhuanyiEntity zichanzhuanyi, HttpServletRequest request){
        EntityWrapper<ZichanzhuanyiEntity> ew = new EntityWrapper<ZichanzhuanyiEntity>();
       PageUtils page = zichanzhuanyiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zichanzhuanyi), params), params));
        return R.ok().put("data", page);
    }
5.3.4资产停用管理
进行资产停用管理，进行资产停用，通过资产编码或名称进行检索，该功能除了展示资产编码、名称、分类等信息，也可以查看资产停用数量和停用日期，可以点击详情，查看详细情况和停用说明，点击修改或删除可以修改或删除记录。资产停用模块的具体效果图如图5-14，5-15所示：

图5–14 资产停用操作图

图5–15 资产停用成功效果图
该模块实现的是资产盘点管理，在ZichantingyongController中通过Spring的IOC机制注入ZichantingyongService，调用其中的interface获取资产信息，然后想详细信息返回给后台。在页面上进行展示。调用的是controller中的方法。其核心代码如下：
其核心代码如下：
@RestController
@RequestMapping("/zichantingyong")
public class ZichantingyongController {
    @Autowired
    private ZichantingyongService zichantingyongService;
    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ZichantingyongEntity zichantingyong,
       HttpServletRequest request){
        EntityWrapper<ZichantingyongEntity> ew = new EntityWrapper<ZichantingyongEntity>();
       PageUtils page = zichantingyongService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zichantingyong), params), params));

        return R.ok().put("data", page);
    }
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ZichantingyongEntity zichantingyong, HttpServletRequest request){
        EntityWrapper<ZichantingyongEntity> ew = new EntityWrapper<ZichantingyongEntity>();
       PageUtils page = zichantingyongService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zichantingyong), params), params));
        return R.ok().put("data", page);
    }
5.3.5资产维修管理
进行资产维修管理，进行资产维修管理，通过资产编码或名称进行检索，该功能除了展示资产编码、名称、分类等信息，也可以查看资产保修天数数量、维修价格和维修日期，可以点击详情，查看详细情况和维修说明，点击修改或删除可以修改或删除记录。资产维修模块具体效果图如图5-16,5-17所示。

图5–16资产上报维修操作图

图5–17 资产上报维修成功效果图
该模块实现的是资产盘点管理，在ZichanweixiuController中通过Spring的IOC机制注入ZichanweixiuService，调用其中的interface获取资产信息，然后想详细信息返回给后台。在页面上进行展示。调用的是controller中的方法。其核心代码如下：
@RestController
@RequestMapping("/zichanweixiu")
public class ZichanweixiuController {
    @Autowired
    private ZichanweixiuService zichanweixiuService;
    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ZichanweixiuEntity zichanweixiu,
       HttpServletRequest request){
        EntityWrapper<ZichanweixiuEntity> ew = new EntityWrapper<ZichanweixiuEntity>();
       PageUtils page = zichanweixiuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zichanweixiu), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ZichanweixiuEntity zichanweixiu, HttpServletRequest request){
        EntityWrapper<ZichanweixiuEntity> ew = new EntityWrapper<ZichanweixiuEntity>();
       PageUtils page = zichanweixiuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zichanweixiu), params), params));
        return R.ok().put("data", page);
    }
5.3.6资产折旧管理
进行资产折旧管理，进行资产折旧管理，通过资产编码或名称进行检索，该功能除了展示资产编码，名称等信息，也可以查看资产原值、每月折旧、累计折旧和资产残值，可以点击详情，查看详细情况，点击修改或删除可以修改或删除记录。资产折旧模块具体效果图如图5-18,5-19所示。

图5–18 资产折旧操作图

图5–19 资产折旧上报成功效果图
该模块实现的是资产盘点管理，在ZichanzhejiuController中通过Spring的IOC机制注入ZichanzhejiuService，调用其中的interface获取资产信息，然后想详细信息返回给后台。在页面上进行展示。调用的是controller中的方法。其核心代码如下：
@RestController
@RequestMapping("/zichanzhejiu")
public class ZichanzhejiuController {
    @Autowired
    private ZichanzhejiuService zichanzhejiuService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ZichanzhejiuEntity zichanzhejiu,
       HttpServletRequest request){
        EntityWrapper<ZichanzhejiuEntity> ew = new EntityWrapper<ZichanzhejiuEntity>();
       PageUtils page = zichanzhejiuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zichanzhejiu), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ZichanzhejiuEntity zichanzhejiu, HttpServletRequest request){
        EntityWrapper<ZichanzhejiuEntity> ew = new EntityWrapper<ZichanzhejiuEntity>();
       PageUtils page = zichanzhejiuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zichanzhejiu), params), params));
        return R.ok().put("data", page);
    }
5.3.7资产申购管理
进行资产申购管理，进行资产申购管理，通过资产名称进行检索，该功能除了展示资产编码、名称等信息，也可以查看资产购买时间、申购人的账号和姓名以及审核回复状态，可以点击详情，查看详细情况，点击修改或删除可以修改或删除记录。资产申购模块具体效果图如图5-20,5-21所示。

图5–20 资产申购操作图

图5–21 资产申购成功效果图
该模块实现的是资产盘点管理，在ZichanshengouController中通过Spring的IOC机制注入ZichanshengouService，调用其中的interface获取资产信息，然后想详细信息返回给后台。在页面上进行展示。调用的是controller中的方法。其核心代码如下：
@RestController
@RequestMapping("/zichanshengou")
public class ZichanshengouController {
    @Autowired
    private ZichanshengouService zichanshengouService;
    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ZichanshengouEntity zichanshengou,
       HttpServletRequest request){
       String tableName = request.getSession().getAttribute("tableName").toString();
       if(tableName.equals("yuangong")) {
          zichanshengou.setZhanghao((String)request.getSession().getAttribute("username"));
       }
        EntityWrapper<ZichanshengouEntity> ew = new EntityWrapper<ZichanshengouEntity>();
       PageUtils page = zichanshengouService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zichanshengou), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ZichanshengouEntity zichanshengou, HttpServletRequest request){
        EntityWrapper<ZichanshengouEntity> ew = new EntityWrapper<ZichanshengouEntity>();
       PageUtils page = zichanshengouService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zichanshengou), params), params));
        return R.ok().put("data", page);
    }
5.3.8资产报废管理
进行资产报废管理，进行资产报废管理，通过资产编码或名称进行检索，该功能除了展示资产编码、名称、分类等信息，也可以查看资产价值和数量、申购人的账号以及报废日期，另外还可以批量统计报废数量，最后可以点击详情，查看详细情况和报废说明，点击修改或删除可以修改或删除记录.资产报废模块具体效果图如图5-23,5-24所示。

图5–23 资产报废操作图

图5–24 资产报废成功上传图
该模块实现的是资产盘点管理，在ZichanqingbaofeiController中通过Spring的IOC机制注入ZichanbaofeiService，调用其中的interface获取资产信息，然后想详细信息返回给后台。在页面上进行展示。调用的是controller中的方法。其核心代码如下：
@RestController
@RequestMapping("/zichanbaofei")
public class ZichanbaofeiController {
    @Autowired
    private ZichanbaofeiService zichanbaofeiService;
    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ZichanbaofeiEntity zichanbaofei,
       HttpServletRequest request){
        EntityWrapper<ZichanbaofeiEntity> ew = new EntityWrapper<ZichanbaofeiEntity>();
       PageUtils page = zichanbaofeiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zichanbaofei), params), params));

        return R.ok().put("data", page);
    }
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ZichanbaofeiEntity zichanbaofei, HttpServletRequest request){
        EntityWrapper<ZichanbaofeiEntity> ew = new EntityWrapper<ZichanbaofeiEntity>();
       PageUtils page = zichanbaofeiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zichanbaofei), params), params));
        return R.ok().put("data", page);
    }
5.3.9资产借还管理
进行资产借还管理，进行资产借还管理，通过资产编码或名称进行检索，该功能除了展示资产编码、名称、分类、价值等信息，也可以查看借出或归还地点和日期，也可以点击详情，查看详细情况和借还情况，点击修改或删除可以修改或删除记录，具体效果图如图5-25,5-26所示：

图5–25 资产借还操作图

图5–26 资产借还成功效果图
该模块实现的是资产盘点管理，在ZichanqdiaoboController中通过Spring的IOC机制注入ZichandaioboService，调用其中的interface方法获取资产信息，然后想详细信息返回给后台。在页面上进行展示。调用的是controller中的方法。其核心代码如下：
@RestController
@RequestMapping("/zichandiaobo")
public class ZichandiaoboController {
    @Autowired
    private ZichandiaoboService zichandiaoboService;
    
    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ZichandiaoboEntity zichandiaobo,
       HttpServletRequest request){
        EntityWrapper<ZichandiaoboEntity> ew = new EntityWrapper<ZichandiaoboEntity>();
       PageUtils page = zichandiaoboService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zichandiaobo), params), params));

        return R.ok().put("data", page);
    }
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ZichandiaoboEntity zichandiaobo, HttpServletRequest request){
        EntityWrapper<ZichandiaoboEntity> ew = new EntityWrapper<ZichandiaoboEntity>();
       PageUtils page = zichandiaoboService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zichandiaobo), params), params));
        return R.ok().put("data", page);
    }
    /**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ZichandiaoboEntity zichandiaobo){
        EntityWrapper<ZichandiaoboEntity> ew = new EntityWrapper<ZichandiaoboEntity>();
        ew.allEq(MPUtil.allEQMapPre( zichandiaobo, "zichandiaobo")); 
        return R.ok().put("data", zichandiaoboService.selectListView(ew));
    }
5.3.10资产盘点管理
进行资产盘点管理，进行资产盘点管理，通过资产编码、名称和分类进行检索，该功能除了展示资产编码、名称、分类、原值、残值等信息，也可以查看存放地点和登记日期，也可以点击详情，查看详细情况，点击修改或删除可以修改或删除记录，具体效果图如图5-27,5-28示：

图5–27 资产盘点操作图

图5–28 资产盘点图
该模块实现的是资产盘点管理，在ZichanqingchaController中通过Spring的IOC机制注入ZichanqingchaService，调用其中的interface获取资产信息，然后想详细信息返回给后台。在页面上进行展示。调用的是controller中的方法。其核心代码如下：
@RestController
@RequestMapping("/zichanqingcha")
public class ZichanqingchaController {
    @Autowired
    private ZichanqingchaService zichanqingchaService;
    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ZichanqingchaEntity zichanqingcha,
       HttpServletRequest request){
        EntityWrapper<ZichanqingchaEntity> ew = new EntityWrapper<ZichanqingchaEntity>();
       PageUtils page = zichanqingchaService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zichanqingcha), params), params));

        return R.ok().put("data", page);
    }
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ZichanqingchaEntity zichanqingcha, HttpServletRequest request){
        EntityWrapper<ZichanqingchaEntity> ew = new EntityWrapper<ZichanqingchaEntity>();
       PageUtils page = zichanqingchaService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zichanqingcha), params), params));
        return R.ok().put("data", page);
    }
    /**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ZichanqingchaEntity zichanqingcha){
        EntityWrapper<ZichanqingchaEntity> ew = new EntityWrapper<ZichanqingchaEntity>();
        ew.allEq(MPUtil.allEQMapPre( zichanqingcha, "zichanqingcha")); 
        return R.ok().put("data", zichanqingchaService.selectListView(ew));
    }
5.3.11系统管理
管理员可以操作，管理主页展示的固定资产，可以通过资产名称进行检索，也可以点击详情，查看详细情况，点击修改或删除可以修改或删除记录，具体效果图如图5-29,5-30示：

图5–29 轮播图上传

图5–30 轮播图上传成功图
该模块实现的是轮播图管理，在ConfigController中通过Spring的IOC机制注入ConfigService，调用其中的getDetail获取轮播图信息，然后想详细信息返回给前台。在页面上进行展示。调用的是controller中的方法。其核心代码如下：
@RequestMapping("config")
@RestController
public class ConfigController{
    @Autowired
    private ConfigService configService;
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ConfigEntity config){
        EntityWrapper<ConfigEntity> ew = new EntityWrapper<ConfigEntity>();
        PageUtils page = configService.queryPage(params);
        return R.ok().put("data", page);
    }
    
  
    @IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ConfigEntity config){
        EntityWrapper<ConfigEntity> ew = new EntityWrapper<ConfigEntity>();
        PageUtils page = configService.queryPage(params);
        return R.ok().put("data", page);
    }
    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") String id){
        ConfigEntity config = configService.selectById(id);
        return R.ok().put("data", config)；
}


6 系统测试
6.1 测试目的
（1）确保系统稳定性。
系统稳定性是高校固定系统管理的基本要求。其是全面评估系统稳定性的关键环节，它能识别并解决系统缺陷，从而增强系统稳定性。
（2）优化系统功能。
系统测试有助于发现系统功能的漏洞，更好地实现功能的优化。通过测试，系统基于满足用户的需求进行优化升级，以便提升用户体验。
（3）提高系统可维护性。
系统测试可以检验系统的设计和实现是否具有良好的可维护性。在测试阶段，可以发现系统潜在的问题，从而为后续的维护工作提供指导。
（4）保障数据安全。
数据安全是系统管理的关键。系统测试致力于审查数据传输、存储和访问的安全性，防止数据泄露或被非法篡改。
（5）提升用户满意度。
系统测试以用户视角进行，验证系统是否符合用户需求。通过测试，可以了解用户对系统的满意度，进一步改进系统，提高用户体验。
6.2 测试方法
本系统测试采用黑盒测试方法，该测试能够检查软件系统是否可以满足用户的需求和功能要求。黑盒测试是一种无需测试人员深入理解代码逻辑或底层技术的测试方法，它更侧重于系统的整体表现和功能正确性。测试者只需掌握一套科学合理的实验流程，并理解测试的各个环节，就能有效地执行黑盒测试。这种测试方式能够确保软件产品的功能与其预期设计保持一致，而无需过多关注代码的实现细节。通过黑盒测试，我们能够从用户的角度出发，进行员工用户注册、管理员操作资产等测试，检查系统是否符合预期，是否满足预定的需求，满足一些用户的基本需求，给用户带来良好的体验，保证系统的稳定性。
6.3 单元测试
6.3.1用户测试
用户登录验证，新用户可以创建账户，输入用户账号，姓名，性别，手机，邮箱等信息，确认无误后，点击注册，数据库中新增一个新的用户。而老用户则使用已经注册账户登录。验证新用户的注册流程，检查其功能是否正常运作，以及是否能够顺利使用。该测试如表6-1所示。

表 6- 1 注册测试用例

测试数据	过程	输出	测试结果	能否通过
不输入任何信息，直接点击注册	账号：
密码：
姓名： 
手机： 
邮箱：	必选项不 能为空	界面不跳转，提示用户输入必填项	符合预期
仅输入用户名和密码	账号：小一
密码：111111	必选项存在	界面跳转，注册成功	符合预期
输入用户名、密码、姓名、手机、邮箱	账号： 小二
密码： 222222
姓名： 222222
手机 222222
邮箱：222222@qq.com	必选项符合规则	界面跳转，注册成功	符合预期
6.2.2管理员测试
（1）资产操作测试，
其包括资产维修、折旧、报废、申购、停用、转移、借还等模块的测试。可以查询资产的具体变更内容。资产上报测试如图6-2所示。
表6–2 资产操作测试
测试数据	过程	输出	测试结果	是否通过
管理员查询相关资产	点击资产相关的查询方式	显示符合条件的资产	查询成功	符合预期
管理添加新的资产	点击对应的功能模块，点击加号，输入资产相关信息	资产进入系统，资产出现的列表	添加成功	符合预期
管理员修改资产的实时情况	点击对应的资产，点击修改，输入修改的信息	更新出修改后的资产信息	修改成功	符合预期
管理员删除记录	点击对应的资产，点击删除	界面资产信息消失	删除成功	符合预期
管理员进行资产转移或者借还	点击对应的功能，找到对应的资产，但是资产数量不够	资产数量不够	无法操作	符合预期
（2）管理员审核测试
管理员对用户的资产申请情况进行处理，审核是否通过。测试如图6-3所示。
表6–3 管理员审核测试
测试数据	过程	输出	测试结果	是否通过
管理员审核申购	进入对应界面，点击审核按钮	跳出审核界面，审核通过，点击确认	审核通过	符合预期
管理员审核申购	进入对应界面，点击审核按钮	跳出审核界面，审核不通过，点击确认	审核不通过	符合预期
6.4 测试结论
通过对高校固定资产管理的测试，检测到系统的各项功能都能够正常运行，也检测出系统出现的一些问题，并及时整改，确保了系统的稳定性，给用户和管理员提供良好的体验，测试也是圆满完成。
总结
(系统优缺点分析比较合理，进一步改进的设想思路较清晰，有较可行的措施。用完删除)

附 录

评分标准
评分项	分值	自评分	指导老师
评分
需求分析：程序模块划分合理、功能描述准确，各功能模块的调用关系清晰。	20分		
系统设计：详细的功能模块、类和数据库的设计，结构非常清晰。	40分		
系统实现总结：系统功能实用性强，程序运行稳定且功能完善。程序结构清晰，代码规范，可读性强。系统优缺点分析合理，进一步改进的设想思路清晰措施可行	40分		
合计		

