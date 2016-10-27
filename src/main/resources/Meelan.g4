grammar Meelan;

statements: (statement (';')?)*;

statement: 'print' e=expr                                                                               #printStmt
            | 'var' ID ('=' val=expr)?                                                                  #defineStmt
            | ID '=' val=expr                                                                           #assignStmt
            | 'while' con=expr 'do' stmt=statement                                                      #whileStmt
            | 'if' con=expr 'then' stmtIf=statement ('else' stmtElse=statement)?                        #ifStmt
						| 'observable' name=ID ',' var=ID																														#observableStmt
						| 'observer' forObs=ID ',' stmt=statement																														#observerStmt
            //| 'if!Null' o=expr ',' con=expr 'then' sIf=statement ('else' sElse=statement)?            #ifNotNullStmt
            //| 'whileif' cif=expr ',' cwhile=expr 'do' '{' sIf=statements '}' '{' sElse=statements '}' #whileIfStmt
            | 'func' funcName=ID '(' idlist ')' statement                                               #funcStmt
            | '{' stmt=statements '}'                                                                   #blockStmt
            | val=expr                                                                                  #simpleExpr
            ;

expr:       left=expr op=('<'|'=<'|'<='|'=='|'><'|'<>'|'!='|'>='|'>') right=expr                        #opExpr
            | left=expr op=('*'|'/'|'%') right=expr                                                     #opExpr
            | left=expr op=('+'|'-') right=expr                                                         #opExpr
            | '-' e=expr                                                                                #negStmt
            | '(' e=expr ')'                                                                            #wrapperExpr
            | funcName=ID '('arglist')'                                                                 #funccallStmt
            | ID                                                                                        #idExpr
            | INT                                                                                       #numExpr
            | '{' stmts=statements '}'                                                                  #inlineStmt
            ;

idlist:     ID (',' ID)*;

arglist:    (expr) (',' expr)*;

ID:         [a-zA-Z][a-zA-Z0-9_]*;
INT:        [0-9]+;

WS          : [ \t\n\r]+ -> skip ;